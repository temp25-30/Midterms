def main():
    def numCatch(message):      
        try:
            number = int(input(message))
        except ValueError:
            print("Must be a numerical value.\n")
            main()
        except:
            print("Unexpected error.\n")
            main()
        return number
    
    uName = input("Enter your name: ")

    pages = numCatch("How many pages does the book have?: ")

    readAm = numCatch("How many pages have you read?: ")

    allotedTime = numCatch("How many days have been alloted to you?: ")

    dayReading = numCatch("How many days have you been reading the book?: ")

    dateForm = ["Day", "Month", "Year"]
    dateInt = [1,1,1967]

    print(">>ENTER ISSUE DATE<<")
    inc = 0
    while(inc<3):
        dateInt[inc] = int(input(f"Enter {dateForm[inc]}:"))
        if dateInt[inc] < 1:
            print("Date too small, try again!")
            continue

        if dateInt[0] > 31:
            print("Day is greater then 31! Try again!")
            continue
        elif dateInt[1] > 12:
            continue
        inc += 1
    daySum = dateInt[0] + allotedTime
    monthSum = dateInt[1]
    yearSum = dateInt[2]

    while(daySum>31):
        monthSum += 1
        daySum -= 31

    while(monthSum > 12):
        yearSum += 1
        monthSum -= 12

    dateDue = [daySum, monthSum, yearSum]
    percRead = (readAm/pages)*100
    daysRemaining = allotedTime - dayReading
    recommendedRate = (pages-readAm)/daysRemaining

    print(">>RESULT<<")
    print(uName)
    print(f"Due Date: {dateDue[0]}, {dateDue[1]}, {dateDue[2]}")
    print(f"You have read {percRead}% of the book so far.")
    print(f"You have {daysRemaining} days remaining")
    print(f"You should read {round(recommendedRate)} pages per day.")

if __name__ == "__main__":
    main()
