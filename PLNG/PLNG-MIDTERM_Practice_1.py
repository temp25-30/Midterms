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
    ...

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
        data = input(f"{i}: ")
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
    ...

def main():
    program4()

if __name__ == "__main__":
    main()