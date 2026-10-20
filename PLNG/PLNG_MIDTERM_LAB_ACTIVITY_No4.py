class DateStructure:
    def __init__(self, date_str):
        try:
            parts = date_str.split("-")
            if len(parts) == 3:
                self.year = int(parts[0])
                self.month = int(parts[1])
                self.day = int(parts[2])
            else:
                raise ValueError
        except Exception:
            self.year, self.month, self.day = 2026, 1, 1

    def __str__(self):
        return f"{self.year}-{self.month:02d}-{self.day:02d}"


class Patient:
    def __init__(self):
        self.name = ""
        self.date_of_admission = None
        self.disease = ""
        self.date_of_discharge = None

    def enter_information(self):
        self.name = input("Name of the patient: ")
        self.date_of_admission = DateStructure(input("Date of admission (YYYY-MM-DD): "))
        self.disease = input("Disease: ")
        self.date_of_discharge = DateStructure(input("Date of discharge (YYYY-MM-DD): "))

    def display(self):
        print(f"Name: {self.name} | Admitted: {self.date_of_admission} | Disease: {self.disease} | Discharged: {self.date_of_discharge}")


class PatientAge(Patient):
    def __init__(self):
        super().__init__()
        self.age = 0

    def enter_information(self):
        super().enter_information()
        while True:
            try:
                self.age = int(input("Age of the patient: "))
            except ValueError:
                self.age = 0
            
            if self.age < 0:
                print("Age of the patient is too small.")
            else:
                break

    def display(self):
        print(f"Name: {self.name} | Age: {self.age} | Admitted: {self.date_of_admission} | Disease: {self.disease} | Discharged: {self.date_of_discharge}")

    def is_pediatric(self):
        return self.age < 12


class Professor:
    def __init__(self, name, salary):
        self.name = name
        self.salary = salary


class Deans(Professor):
    def __init__(self, name, salary, department):
        super().__init__(name, salary)
        self.department = department

    def __str__(self):
        return f"Status\nRank: Dean\nName: {self.name}\nDepartment: {self.department}\nSalary: {int(self.salary)}"


class Executive(Deans):
    def __init__(self, name, salary, department):
        super().__init__(name, salary, department)

    def __str__(self):
        return f"Status\nRank: Executive\nName: {self.name}\nDepartment: {self.department}\nSalary: {int(self.salary)}"


def run_program1():
    print("\n--- Program 1: Bank Account Simulator ---")
    print("Welcome!")
    try:
        balance = float(input("Enter your balance: "))
    except ValueError:
        print("Invalid amount. Setting balance to 0.")
        balance = 0.0

    while True:
        print("Select an option:")
        print("1. Withdraw Amount")
        print("2. Deposit Amount")
        print("3. Exit")
        option = input("Choice: ")

        if option == "1":
            print("How much amount you want to withdraw from your account?")
            try:
                withdraw = float(input("Amount: "))
                if withdraw > balance:
                    print("Insufficient funds!")
                else:
                    balance -= withdraw
                    print(f"Your new balance is: {int(balance)}")
            except ValueError:
                print("Invalid numeric input.")
        elif option == "2":
            print("How much amount you want to deposit in your account?")
            try:
                deposit = float(input("Amount: "))
                balance += deposit
                print(f"Your new balance is: {int(balance)}")
            except ValueError:
                print("Invalid numeric input.")
        elif option == "3":
            print("Thank you for using the system!")
            break
        else:
            print("Invalid option.")


def run_program2():
    print("\n--- Program 2: Hospital Patient Database ---")
    database = []

    while True:
        print("\nOUTPUT IN ACTIVITY 2")
        print("1. Insert New Patient")
        print("2. Display all Patient")
        print("3. Display pediatric patient")
        print("4. Exit")
        choice = input("Choice: ")

        if choice == "1":
            p = PatientAge()
            p.enter_information()
            database.append(p)
            print("Patient recorded successfully.")
        elif choice == "2":
            print("\n--- All Patients ---")
            if not database:
                print("No records found.")
            for p in database:
                p.display()
        elif choice == "3":
            print("\n--- Pediatric Patients (< 12 years old) ---")
            count = 0
            for p in database:
                if p.is_pediatric():
                    p.display()
                    count += 1
            if count == 0:
                print("No pediatric records found.")
        elif choice == "4":
            break
        else:
            print("Invalid choice.")


def run_program3():
    print("\n--- Program 3: University Hierarchy Test ---")
    dean = Deans("John Cena", 32000, "English")
    exec_member = Executive("Ronald McDonald", 42000, "Computer Science")

    print(dean)
    print()
    print(exec_member)
    
    input("\nPress Enter to return to main menu...")


def main():
    while True:
        print("\n====================================")
        print("            MAIN MENU               ")
        print("====================================")
        print("1. Program 1: Bank Account Simulator")
        print("2. Program 2: Hospital Patient Database")
        print("3. Program 3: University Hierarchy (Professor/Dean/Executive)")
        print("4. Exit")
        choice = input("Select a program to run (1-4): ")

        if choice == "1":
            run_program1()
        elif choice == "2":
            run_program2()
        elif choice == "3":
            run_program3()
        elif choice == "4":
            print("Exiting Main Menu. Goodbye!")
            break
        else:
            print("Invalid choice! Please select between 1 and 4.")


if __name__ == "__main__":
    main()