import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OOPR_MIDTERM_LAB_ACTIVITY6 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n====================================");
            System.out.println("            MAIN MENU               ");
            System.out.println("====================================");
            System.out.println("1. Program 1: Bank Account Simulator");
            System.out.println("2. Program 2: Hospital Patient Database");
            System.out.println("3. Program 3: University Hierarchy (Professor/Dean/Executive)");
            System.out.println("4. Exit");
            System.out.print("Select a program to run (1-4): ");

            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    runProgram1();
                    break;
                case "2":
                    runProgram2();
                    break;
                case "3":
                    runProgram3();
                    break;
                case "4":
                    System.out.println("Exiting Main Menu. Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice! Please select between 1 and 4.");
            }
        }
    }

    private static void runProgram1() {
        System.out.println("\n--- Program 1: Bank Account Simulator ---");
        System.out.println("Welcome!");
        System.out.print("Enter your balance: ");
        double balance = 0;
        try {
            balance = Double.parseDouble(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Invalid amount. Setting balance to 0.");
        }

        while (true) {
            System.out.println("Select an option:");
            System.out.println("1. Withdraw Amount");
            System.out.println("2. Deposit Amount");
            System.out.println("3. Exit");
            System.out.print("Choice: ");
            String option = scanner.nextLine();

            if (option.equals("1")) {
                System.out.println("How much amount you want to withdraw from your account?");
                System.out.print("Amount: ");
                try {
                    double withdraw = Double.parseDouble(scanner.nextLine());
                    if (withdraw > balance) {
                        System.out.println("Insufficient funds!");
                    } else {
                        balance -= withdraw;
                        System.out.println("Your new balance is: " + (int)balance);
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Invalid numeric input.");
                }
            } else if (option.equals("2")) {
                System.out.println("How much amount you want to deposit in your account?");
                System.out.print("Amount: ");
                try {
                    double deposit = Double.parseDouble(scanner.nextLine());
                    balance += deposit;
                    System.out.println("Your new balance is: " + (int)balance);
                } catch (NumberFormatException e) {
                    System.out.println("Invalid numeric input.");
                }
            } else if (option.equals("3")) {
                System.out.println("Thank you for using the system!");
                break;
            } else {
                System.out.println("Invalid option.");
            }
        }
    }

    static class DateStructure {
        int year, month, day;

        public DateStructure(String dateStr) {
            try {
                String[] parts = dateStr.split("-");
                if (parts.length == 3) {
                    this.year = Integer.parseInt(parts[0]);
                    this.month = Integer.parseInt(parts[1]);
                    this.day = Integer.parseInt(parts[2]);
                }
            } catch (Exception e) {
                this.year = 2026; this.month = 1; this.day = 1;
            }
        }

        @Override
        public String toString() {
            return year + "-" + String.format("%02d", month) + "-" + String.format("%02d", day);
        }
    }

    static class Patient {
        String name;
        DateStructure dateOfAdmission;
        String disease;
        DateStructure dateOfDischarge;

        public void enterInformation() {
            System.out.print("Name of the patient: ");
            this.name = scanner.nextLine();
            System.out.print("Date of admission (YYYY-MM-DD): ");
            this.dateOfAdmission = new DateStructure(scanner.nextLine());
            System.out.print("Disease: ");
            this.disease = scanner.nextLine();
            System.out.print("Date of discharge (YYYY-MM-DD): ");
            this.dateOfDischarge = new DateStructure(scanner.nextLine());
        }

        public void display() {
            System.out.println("Name: " + name + " | Admitted: " + dateOfAdmission + " | Disease: " + disease + " | Discharged: " + dateOfDischarge);
        }
    }

    static class PatientAge extends Patient {
        int age;

        @Override
        public void enterInformation() {
            super.enterInformation();
            do{
                System.out.print("Age of the patient: ");
                try {
                    this.age = Integer.parseInt(scanner.nextLine());
                } catch (NumberFormatException e) {
                    this.age = 0;
                }
                if(this.age < 0){
                    System.out.println("Age of the patient is too small.");
                }
            }while(this.age < 0);
        }

        @Override
        public void display() {
            System.out.println("Name: " + name + " | Age: " + age + " | Admitted: " + dateOfAdmission + " | Disease: " + disease + " | Discharged: " + dateOfDischarge);
        }

        public boolean isPediatric() {
            return this.age < 12;
        }
    }

    private static void runProgram2() {
        System.out.println("\n--- Program 2: Hospital Patient Database ---");
        List<PatientAge> database = new ArrayList<>();

        while (true) {
            System.out.println("\nOUTPUT IN ACTIVITY 2");
            System.out.println("1. Insert New Patient");
            System.out.println("2. Display all Patient");
            System.out.println("3. Display pediatric patient");
            System.out.println("4. Exit");
            System.out.print("Choice: ");
            String choice = scanner.nextLine();

            if (choice.equals("1")) {
                PatientAge p = new PatientAge();
                p.enterInformation();
                database.add(p);
                System.out.println("Patient recorded successfully.");
            } else if (choice.equals("2")) {
                System.out.println("\n--- All Patients ---");
                if (database.isEmpty()) System.out.println("No records found.");
                for (PatientAge p : database) {
                    p.display();
                }
            } else if (choice.equals("3")) {
                System.out.println("\n--- Pediatric Patients (< 12 years old) ---");
                int count = 0;
                for (PatientAge p : database) {
                    if (p.isPediatric()) {
                        p.display();
                        count++;
                    }
                }
                if (count == 0) System.out.println("No pediatric records found.");
            } else if (choice.equals("4")) {
                break;
            } else {
                System.out.println("Invalid choice.");
            }
        }
    }

    static class Professor {
        String name;
        double salary;

        public Professor(String name, double salary) {
            this.name = name;
            this.salary = salary;
        }
    }

    static class Deans extends Professor {
        String department;

        public Deans(String name, double salary, String department) {
            super(name, salary);
            this.department = department;
        }

        @Override
        public String toString() {
            return "Status\nRank: Dean\nName: " + name + "\nDepartment: " + department + "\nSalary: " + (int)salary;
        }
    }

    static class Executive extends Deans {
        public Executive(String name, double salary, String department) {
            super(name, salary, department);
        }

        @Override
        public String toString() {
            return "Status\nRank: Executive\nName: " + name + "\nDepartment: " + department + "\nSalary: " + (int)salary;
        }
    }

    private static void runProgram3() {
        System.out.println("\n--- Program 3: University Hierarchy Test ---");
        
        Deans dean = new Deans("John Cena", 32000, "English");
        Executive exec = new Executive("Ronald McDonald", 42000, "Computer Science");

        System.out.println(dean);
        System.out.println();
        System.out.println(exec);
        
        System.out.print("\nPress Enter to return to main menu...");
        scanner.nextLine();
    }
}
