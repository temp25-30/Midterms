#PLNG-MIDTERM Practice 1
def program1():
    numbers = []
    print("Python Program that reads 10 real numbers from the user (negative and positive numbers) into an array.")
    i = 0
    while(i<8):
        try:
            num = float(input("Enter number: "))
        except ValueError:
            print("! Please input a number. Try again.\n")
            continue
        numbers.append(num)
        i+=1

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
    print("Python program that reads the 8 integer numbers from the user into an array.")
    print("Enter 8 numbers: ")
    i = 0
    while(i < 8):
        try:
            num = float(input(f"[{i+1}]: "))
        except ValueError:
            print("! Please input a number. Try again.\n")
            continue
        numbers.append(num)
        i += 1

    uniqueArray = list(set(numbers))
    uniqueArray.sort()

    secondSmallest = uniqueArray[1]
    secondLargest = uniqueArray[len(uniqueArray) - 2]

    print(f"No duplicates: {uniqueArray}")
    print(f"Second smallest element: {secondSmallest}")
    print(f"Second largest element: {secondLargest}")    

def program3():
    numbers = []
    print("Python program that deletes an element in an array from specific position.")
    i = 0
    while(i<8):
        try:
            num = int(input("Enter data to array: "))
        except ValueError:
            print("! Please input a number. Try again.\n")
            continue
        numbers.append(num)
        i+=1
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
    print("Python program to find even elements and odd elements in array.")
    ask = True
    while(ask):
        try:
            num = int(input("Input size of array: "))
        except ValueError:
            print("! Please input a number. Try again.\n")
            continue
        ask = False

    numbers = []
    print("Enter Data in array: ")
    i = 0
    while(i<num):
        try:
            data = int(input(f"[{i+1}]: "))
        except ValueError:
            print("! Please input a number. Try again.\n")
            continue            
        numbers.append(data)
        i+=1

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
    print("Right Triangle:")
    for i in range(0,4):
        for j in range(i+1):
            if j == 0:
                print("*", end="")
            else:
                print("A*", end="")
        print("\n", end="")

def program6():
    print("Python program to evaluate the net salary of an employee given the following constraints:")
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
        try:
            selected = int(input())
        except ValueError:
            print("! Please input a number. Try again.\n")
            continue

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