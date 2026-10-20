import java.util.Scanner;
//Account parent
abstract class Account {
    private String accountNumber;
    private double balance;

    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        //check for negative input
        if (amount <= 0) {
            System.out.println("Error! Deposit amount must be positive!");
            return;
        }
        this.balance += amount;
        System.out.printf("New %s balance: ₱%.2f%n", getAccountType(), this.balance);
    }

    public void withdraw(double amount) {
        //check for negative input
        if (amount <= 0) {
            System.out.println("Error! Withdrawal amount must be positive!");
            return;
        }
        double fee = calculateWithdrawalFee();
        if (amount + fee > this.balance) {
            System.out.println("Transaction Rejected: Insufficient balance to cover amount and fee.");
            return;
        }

        this.balance -= (amount + fee);
        System.out.printf("Withdrawal fee: ₱%.2f | New %s balance: ₱%.2f%n", fee, getAccountType(), this.balance);
    }

    // Abstract methods ensuring polymorphism and abstraction
    public abstract double calculateWithdrawalFee();
    public abstract String getAccountType();
}

//SavingsAccount
class SavingsAccount extends Account {
    public SavingsAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public double calculateWithdrawalFee() {
        return 0.00;
    }

    @Override
    public String getAccountType() {
        return "Savings";
    }
}

//CheckingAccount
class CheckingAccount extends Account {
    public CheckingAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public double calculateWithdrawalFee() {
        return 10.00;
    }

    @Override
    public String getAccountType() {
        return "Checking";
    }
}


public class WEEK10_MIDTERM_LabAcitivy5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the OOP Banking System");
        double openingBalance = readNonNegativeBalance(scanner);

        //Account objects
        SavingsAccount savingsAccount = new SavingsAccount("SAV-101", openingBalance);
        CheckingAccount checkingAccount = new CheckingAccount("CHK-202", openingBalance);

        Account selectedAccount = savingsAccount;

        boolean running = true;
        while (running) {
            printAccountSummary(selectedAccount);
            showMenu();
            
            System.out.print("Choice: "); String input = scanner.next();
            int choice = -1;
            try {
                choice = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.print("Unexpected Error.");
            }

            switch (choice) {
                case 1:
                    double withdrawAmt = readPositiveAmount(scanner, "Amount to withdraw: ");
                    if (withdrawAmt > 0) {
                        selectedAccount.withdraw(withdrawAmt);
                    }
                    break;
                case 2:
                    double depositAmt = readPositiveAmount(scanner, "Amount to deposit: ");
                    if (depositAmt > 0) {
                        selectedAccount.deposit(depositAmt);
                    }
                    break;
                case 3:
                    System.out.printf("Current balance: ₱%.2f%n", selectedAccount.getBalance());
                    break;
                case 4:
                    if (selectedAccount instanceof SavingsAccount) {
                        selectedAccount = checkingAccount;
                    } else {
                        selectedAccount = savingsAccount;
                    }
                    break;
                case 5:
                    System.out.println("Thank you for using the system!");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice! Please select an option between 1 and 5.");
                    break;
            }
            System.out.println(); // Prints empty line for readable output spacing
        }
        scanner.close();
    }

    public static void showMenu() {
        System.out.print("1 Withdraw   2 Deposit   3 Show balance   4 Switch account   5 Exit\n");
    }

    public static double readNonNegativeBalance(Scanner scanner) {
        double balance = -1;
        while (balance < 0) {
            System.out.print("Opening balance: ");
            if (scanner.hasNextDouble()) {
                balance = scanner.nextDouble();
                if (balance < 0) {
                    System.out.println("Error: Opening balance cannot be negative.");
                }
            } else {
                System.out.println("Error: Please enter a valid number.");
                scanner.next(); // clear buffer
            }
        }
        return balance;
    }

    public static double readPositiveAmount(Scanner scanner, String prompt) {
        System.out.print(prompt);
        if (scanner.hasNextDouble()) {
            double amount = scanner.nextDouble();
            if (amount <= 0) {
                System.out.println("Error: Amount must be greater than zero.");
                return -1;
            }
            return amount;
        } else {
            System.out.println("Error: Invalid numeric amount.");
            scanner.next(); // clear buffer
            return -1;
        }
    }

    public static void printAccountSummary(Account account) {
        System.out.printf("Current account: %s | Balance: ₱%.2f%n", account.getAccountType(), account.getBalance());
    }
}
