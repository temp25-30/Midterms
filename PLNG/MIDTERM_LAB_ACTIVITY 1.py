counterList = []    #list of counters
regTicketList = []  #list of regular tickets
prTicketList = []   #list of priority tickets

servingList = []    #list of tickets currently being served
completedList = []  #list of completed tickets

nextTicketId = 1

priorityStreak = 0

VALID_PURPOSES = {"enrollment", "records", "payment"}
VALID_TYPES = {"regular", "priority"}

class WaitingTicketIterator:
    #Iterator that yields currently waiting tickets from a queue snapshot.
    def __init__(self, tickets):
        #Create a snapshot list of tickets that are currently waiting
        self._waitingList = [t for t in tickets if t["status"] == "waiting"]
        self._index = 0

    def __iter__(self):
        return self

    def __next__(self):
        if self._index >= len(self._waitingList):
            raise StopIteration
        ticket = self._waitingList[self._index]
        self._index += 1
        return ticket

def addCounters(counterAmount):
    for i in range(counterAmount):
        counter = {
        "number": i+1,
        "status": "free",
        "servingID": 0
        }
        counterList.append(counter)
addCounters(2)
availableCounters = len(counterList)

def freeCounter(counterNumber):
    global availableCounters
    for counter in counterList:
        if counter["number"] == counterNumber:
            counter["status"] = "free"
            counter["servingID"] = 0
            availableCounters += 1
            break

def verifyCounter(counterNumber, ticketID):
    if counterNumber > len(counterList) or counterNumber <= 0:
        raise Exception("Counter does not exist!")

    for counter in counterList:
        if counter["number"] == counterNumber:
            if counter["servingID"] != ticketID:
                raise Exception("Counter is not serving that ticket ID")
                
def issueTicket(purpose, service_type="regular"):
    global nextTicketId
    
    formatPurpose = purpose.strip().lower()
    formatType = service_type.strip().lower()

    if formatPurpose not in VALID_PURPOSES:
        return print(f"Invalid purpose. Choose from: {', '.join(VALID_PURPOSES)}")
    if formatType not in VALID_TYPES:
        return print(f"Invalid service type. Choose from: {', '.join(VALID_TYPES)}")
    
    ticket = {
        "id": nextTicketId,
        "purpose": formatPurpose,
        "type": formatType,
        "status": "waiting"     #statuses: waiting, served, or cancelled
    }

    if formatType == "priority":
        prTicketList.append(ticket)
        print(f"✓ Issued priority ticket ID: {ticket["id"]}")
    else:
        regTicketList.append(ticket)
        print(f"✓ Issued regular ticket ID: {ticket["id"]}")
    nextTicketId += 1

def issueMany(ticketAmout, *requests):
    for i in range(ticketAmout):
        issueTicket(requests[0], requests[1])    

def callNext():
    global priorityStreak, availableCounters
    #Within each service type, serve tickets in the order they were created. Priority tickets may go first, but after two
    #consecutive priority tickets, serve one regular ticket if any regular ticket is waiting. Then reset the priority streak.
    #print(prTicketList[0]["id"]," ",prTicketList[0]["status"])

    #checks for free counters
    index = 0
    for counter in counterList:
            if counter["status"] == "free":
                counterIndex = index
                break
            index += 1
    
    def moveToCounter(listOrigin):
        print(f"\n>>Now Serving Ticket: {listOrigin[0]["id"]} @ counter: {counterList[counterIndex]["number"]}<<")
        servingList.append(listOrigin[0])
        counterList[counterIndex]["servingID"] = listOrigin[0]["id"]
        counterList[counterIndex]["status"] = "busy"
        listOrigin.pop(0)

    if availableCounters > 0:
        if len(prTicketList) != 0 and priorityStreak < 2:
            moveToCounter(prTicketList)
            priorityStreak += 1
        else:
            if len(regTicketList) != 0:
                moveToCounter(regTicketList)
                if priorityStreak >= 2:
                    priorityStreak = 0   
            else:
                print("No tickets in queue.")
        availableCounters -= 1
    else:
        print("No free counters.")

def counterStatuses():
    print("\nStatus of counters: ")
    for counter in counterList:
        print(f"Counter #{counter["number"]} || Status: {counter["status"]}")
        if counter["servingID"] != 0:
            print(f"\tCurrently serving: {counter["servingID"]}")
    print("\n")

def completeServ(statusType="completed"):
    if len(servingList) != 0:
        counterStatuses()
        try:
            ticketId = int(input("Input ticket ID to complete: "))
            counterNumber = int(input("Input your counter number: "))
        except ValueError:
            return print("\nError: That is not a valid integer!")
        
        #check if counter exists
        if counterNumber > len(counterList) or counterNumber <= 0:
            return print("\nCounter does not exist!")
        #check if counter is currently serving that ticket
        for counter in counterList:
            if counter["number"] == counterNumber:
                if counter["servingID"] != ticketId:
                    return print("\nCounter is not serving that ticket ID!")

        incre = 0
        for ticket in servingList:
            if ticket["id"] == ticketId:
                if statusType == "cancelled":
                    print(f"Cancelled: #{ticket["id"]}")
                else:
                    print(f"Completed: #{ticket["id"]}")
                ticket["status"] = statusType
                completedList.append(ticket)
                servingList.pop(incre)
                freeCounter(counterNumber)
                break
            incre += 1
    else:
        print("Counters are not serving a ticket.")

def showWaiting():
    print("\n=Waiting Tickets=")
    mergedList = prTicketList + regTicketList
    it = WaitingTicketIterator(mergedList)
    count = 0
    try:
        while True:
            t = next(it)
            print(f"Ticket #{t['id']} | {t['purpose']} | Type: {t['type']}")
            count += 1
    except StopIteration:
        if count == 0:
            print("No tickets currently waiting.")

def cStatHist():
    #counter status and completed history
    counterStatuses()

    print("List of completed tickets: ")
    if len(completedList) == 0:
        print("\tNO COMPLETED TICKETS")
    else:
        for completedTicket in completedList:
            print(completedTicket["id"])

def summaryReport(**kwargs):
    # prints optional counts such as waiting, served, cancelled, and free counters. Unknown
    # metadata must not affect queue decisions.
    print("\n--- Summary Report ---")
    waitingCount = len(prTicketList) + len(regTicketList)
    servedCount = sum(1 for t in completedList if t["status"] == "completed")
    cancelledCount = sum(1 for t in completedList if t["status"] == "cancelled")
    freeCounters = sum(1 for counter in counterList if counter == "free")

    if kwargs.get("waiting", True):
        print(f"Waiting Tickets: {waitingCount}")
    if kwargs.get("served", True):
        print(f"Served Tickets: {servedCount}")
    if kwargs.get("cancelled", True):
        print(f"Cancelled Tickets: {cancelledCount}")
    if kwargs.get("free_counters", True):
        print(f"Free Counters: {freeCounters}")    

running = True
def main():
    global running
    while running == True:
        print("1 Issue a ticket\n2 Call the next ticket\n3 Complete a service\n4 Cancel a waiting ticket\n5 Show waiting tickets\n6 Show counter status and completed history\n7 Show a summary report\n8 Exit")
        try:
            x = int(input(">> "))
        except ValueError:
            print("\nError: That is not a valid integer! Try Again!\n")
            continue
        match x:
            case 1:
                try:
                    ticketAmout = int(input("How many tickets would you like to issue?: "))
                except ValueError:
                    print("\nError: That is not a valid integer! Try Again!\n")
                    continue
                purpose = input("What is the purpose of your visit? (Enrollment, Records, or Payment): ")
                priority = input("Are you a priority customer? (Regular or Priority): ")

                issueMany(ticketAmout, purpose,priority)
            case 2:
                callNext()
            case 3:
                completeServ()
            case 4:
                completeServ("cancelled")
            case 5:
                showWaiting()
            case 6:
                cStatHist()
            case 7:
                #countType = input("Which optional count do you want to display?[Waiting, Served, Cancelled, Free Counters]: ")
                summaryReport(waiting=True, served=True, cancelled=True, free_counters=True)
            case 8:
                exitOpt = input("Are you sure you want to exit the program? (To confirm; input 'Y', otherwise input any character.): ")
                if exitOpt.strip().lower() == 'y':
                    running = False
            case _:
                print("Invalid input. Please only input numbers in between 1 and 8")
        print("")
        
if __name__ == '__main__':
    main()