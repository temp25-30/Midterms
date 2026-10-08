#PLNG-MIDTERM Practice 1

def program1():
    numbers = []
    for i in range(0,10):
        num = input("Enter number: ")
        numFlt = num.strip()
        cleanNum = numFlt.replace(",", "")
        numbers.append(float(cleanNum))

    sumPositive = 0
    countPositive = 0
    countNegative = 0
    minVal = numbers[0]
    for i in numbers:
        if i>0:
            countPositive += 1
            sumPositive += i

    for i in numbers:
        if i<0:
            countNegative += 1

    for i in numbers:
        if minVal > i:
            minVal = i

    average = sumPositive/countPositive
    print(f"Sum of positive numbers: {sumPositive}")
    print(f"Minumum number: {minVal}")
    print(f"Average of positive numbers: {average}")
    print(f"Total negative numbers: {countNegative}")

def program2():
    numbers = []
    print("Enter 8 numbers: ")
    for i in range(0,8):
        num = input(f"[{i+1}]: ")
        numFlt = num.strip()
        cleanNum = numFlt.replace(",", "")
        numbers.append(float(cleanNum))

    uniqueArray = list(set(numbers))
    uniqueArray.sort()

    secondSmallest = uniqueArray[1]
    secondLargest = uniqueArray[len(uniqueArray) - 2]

    print(f"No duplicates: {uniqueArray}")
    print(f"Second smallest element: {secondSmallest}")
    print(f"Second largest element: {secondLargest}")    

def program3():
    numbers = []
    for i in range(0,5):
        num = input("Enter data array: ")
        numFlt = num.strip()
        cleanNum = numFlt.replace(",", "")
        numbers.append(int(cleanNum))
    print("Stored data in array: ")
    for i in numbers:
        print(i," ")

    print("Enter poss. of Element to Delete: ")
    strInput = input()
    posDelStrp = strInput.strip()
    posDel = int(posDelStrp.replace(",", ""))

    numbers.pop(posDel)
    print("New data in Array: ")
    for i in numbers:
        print(i," ")

def program4():
    num = input("Input size of array: ")
    numFlt = num.strip()
    cleanSize = int(numFlt.replace(",", ""))

    numbers = []
    print("Enter Data in array: ")
    for i in range(0,cleanSize):
        data = input(f"[{i+1}]: ")
        dataStrp = data.strip()
        cleanNum = dataStrp.replace(",", "")
        numbers.append(int(cleanNum))

    evens = []
    odds = []
    for i in numbers:    
        if i%2==0:
            evens.append(i)
        else:
            odds.append(i)        

    print("Even numbers: ")
    for even in evens:
        print(even," ", end="")
    print("\nOdd numbers: ")
    for odd in odds:
        print(odd," ", end="")    

def program5():
    for i in range(0,4):
        for j in range(i+1):
            if j == 0:
                print("*", end="")
            else:
                print("A*", end="")
        print("\n", end="")

def program6():
    basicSalary = 12000
    hra = 150
    ta = 120
    others = 450
    
    da = 0.12 * basicSalary
    pf = 0.14 * basicSalary
    it = 0.15 * basicSalary
    
    total_earnings = basicSalary + da + hra + ta + others
    total_deductions = pf + it
    
    net_salary = total_earnings - total_deductions

    print("Net Salary: ")
    print(f"Basic Salary:   ${basicSalary:,.2f}")
    print(f"DA (12%):       ${da:,.2f}")
    print(f"HRA:            ${hra:,.2f}")
    print(f"TA:             ${ta:,.2f}")
    print(f"Others:         ${others:,.2f}\n")

    print(f"Tax cuts: ")
    print(f"PF (14%):    -${pf:,.2f}")
    print(f"IT (15%):    -${it:,.2f}\n")

    print(f"Net Salary:     ${net_salary:,.2f}")

selection = True
def main():
    global selection
    while(selection == True):
        print("Select program to be run:\nProgram 1.\nProgram 2.\nProgram 3.\nProgram 4.\nProgram 5.\nProgram 6.\nExit 7.")
        selected = int(input())

        cont = input("Would you like to continue? Y/N: ")
        cont.lower()
        if cont == "y":
            selection = False
            break
        else:
            selection = True

    match(selected):
        case 1:
            program1()
        case 2:
            program2()
        case 3:
            program3()
        case 4:
            program4()
        case 5:
            program5()
        case 6:
            program6()
        case 7:
            print("Exiting System...")
        case _:
            main()

if __name__ == "__main__":
    main()
