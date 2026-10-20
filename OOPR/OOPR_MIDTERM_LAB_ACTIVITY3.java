import java.util.Scanner;
public class OOPR_MIDTERM_LAB_ACTIVITY3{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n=======================================================");
            System.out.println("          MASTER MIDTERM PROGRAMMING ACTIVITIES         ");
            System.out.println("=======================================================");
            System.out.println("[1]  Vowel or Consonant Check     [17] Sum of Squares (1 to n)");
            System.out.println("[2]  Numerical Date Converter     [18] Sum of Sequence (1 to n)");
            System.out.println("[3]  Temperature State Examiner   [19] Reverse an Input Number");
            System.out.println("[4]  Air Force Plane Labeler      [20] Sum of Powers (1^1 to n^n)");
            System.out.println("[5]  Ship Class Identifier        [21] Right-Angle Triangle (*)");
            System.out.println("[6]  Earthquake Richter Scale     [22] Floyd's Triangle (0/1)");
            System.out.println("[7]  Number to Words Converter    [23] Odd Asterisks Pyramid");
            System.out.println("[8]  Roman Numerals Converter     [24] Repeating Number Pyramid");
            System.out.println("[9]  Tuition Fee Computations     [25] Asterisk Pyramid");
            System.out.println("[10] Percentile Grade Converter   [26] Incremented Number Pyramid");
            System.out.println("[11] Number Squared Columns       [27] Continuous Number Triangle");
            System.out.println("[12] Alternate Sequence Output    [28] Repeating Number Triangle");
            System.out.println("[13] Reverse Alternate Sequence   [29] Running Number Triangle");
            System.out.println("[14] Factorial Value (n!) Counter [30] Diamond Pattern Printer");
            System.out.println("[15] Fibonacci Sequence Generator [31] Palindromic Number Pyramid");
            System.out.println("[16] Power Value (Base^Exp) Calculator");
            System.out.println("[0]  EXIT MASTER APP");
            System.out.println("=======================================================");
            System.out.print("Select a program activity number: ");

            int choice = -1;
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
            } else {
                scanner.next();
            }

            System.out.println("\n--- RUNNING ACTIVITY #" + choice + " ---");
            switch (choice) {
                case 0:
                    System.out.println("Exiting application. Goodbye!");
                    running = false;
                    break;
                case 1: runActivity1(scanner); break;
                case 2: runActivity2(scanner); break;
                case 3: runActivity3(scanner); break;
                case 4: runActivity4(scanner); break;
                case 5: runActivity5(scanner); break;
                case 6: runActivity6(scanner); break;
                case 7: runActivity7(scanner); break;
                case 8: runActivity8(scanner); break;
                case 9: runActivity9(scanner); break;
                case 10: runActivity10(scanner); break;
                case 11: runActivity11(); break;
                case 12: runActivity12(); break;
                case 13: runActivity13(); break;
                case 14: runActivity14(scanner); break;
                case 15: runActivity15(scanner); break;
                case 16: runActivity16(scanner); break;
                case 17: runActivity17(scanner); break;
                case 18: runActivity18(scanner); break;
                case 19: runActivity19(scanner); break;
                case 20: runActivity20(scanner); break;
                case 21: runActivity21(scanner); break;
                case 22: runActivity22(scanner); break;
                case 23: runActivity23(scanner); break;
                case 24: runActivity24(scanner); break;
                case 25: runActivity25(scanner); break;
                case 26: runActivity26(scanner); break;
                case 27: runActivity27(scanner); break;
                case 28: runActivity28(scanner); break;
                case 29: runActivity29(scanner); break;
                case 30: runActivity30(scanner); break;
                case 31: runActivity31(scanner); break;
                default:
                    System.out.println("Invalid selection! Please enter a valid menu number.");
            }
        }
        scanner.close();
    }

    //programs
    private static void runActivity1(Scanner sc) {
        System.out.print("Enter a letter: ");
        char ch = sc.next().charAt(0);
        if (Character.isLetter(ch)) {
            char lower = Character.toLowerCase(ch);
            if (lower == 'a' || lower == 'e' || lower == 'i' || lower == 'o' || lower == 'u') {
                System.out.println(ch + " is a VOWEL.");
            } else {
                System.out.println(ch + " is a CONSONANT.");
            }
        } else {
            System.out.println("Not a valid alphabetical letter.");
        }
    }

    private static void runActivity2(Scanner sc) {
        System.out.print("Enter date in numerical form (e.g., 2 26 1986): ");
        int month = sc.nextInt();
        int day = sc.nextInt();
        int year = sc.nextInt();
        String[] months = {"", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        if (month >= 1 && month <= 12) {
            System.out.println(months[month] + " " + day + ", " + year);
        } else {
            System.out.println("Invalid month integer.");
        }
    }

    private static void runActivity3(Scanner sc) {
        System.out.print("Enter temperature value: ");
        double temp = sc.nextDouble();
        if (temp < 0) System.out.println("ICE");
        else if (temp <= 100) System.out.println("WATER");
        else System.out.println("STEAM");
    }

    private static void runActivity4(Scanner sc) {
        System.out.print("Enter speed (km/h): ");
        double speed = sc.nextDouble();
        System.out.print("Enter length (meters): ");
        double length = sc.nextDouble();
        if (speed > 1100 && length > 52) System.out.println("Aircraft Label: civilian");
        else if (speed <= 500 && length <= 20) System.out.println("Aircraft Label: military");
        else System.out.println("It's a bird");
    }

    private static void runActivity5(Scanner sc) {
        System.out.print("Enter Ship Class ID (Borb, Corc, Dord, Forf): ");
        String id = sc.next();
        switch (id.toLowerCase()) {
            case "borb": System.out.println("Ship Class: Battleship"); break;
            case "corc": System.out.println("Ship Class: Cruiser"); break;
            case "dord": System.out.println("Ship Class: Destroyer"); break;
            case "forf": System.out.println("Ship Class: Frigate"); break;
            default: System.out.println("Unknown Ship ID.");
        }
    }

    private static void runActivity6(Scanner sc) {
        System.out.print("Enter Richter Scale metric value: ");
        double r = sc.nextDouble();
        if (r < 5.0) System.out.println("Little or no damage");
        else if (r < 5.5) System.out.println("Some damage");
        else if (r < 6.5) System.out.println("Serious damage");
        else if (r < 7.5) System.out.println("Disaster");
        else System.out.println("Catastrophe");
    }

    private static void runActivity7(Scanner sc) {
        System.out.print("Enter a number (Max 3000): ");
        int num = sc.nextInt();
        if (num < 0 || num > 3000) { System.out.println("Out of bounds!"); return; }
        if (num == 0) { System.out.println("zero"); return; }
        String[] units = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
        String[] tens = {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
        String out = "";
        if (num / 1000 > 0) { out += units[num / 1000] + " thousand "; num %= 1000; }
        if (num / 100 > 0) { out += units[num / 100] + " hundred "; num %= 100; }
        if (num > 0) {
            if (num < 20) out += units[num];
            else { out += tens[num / 100]; if (num % 10 > 0) out += " " + units[num % 10]; }
        }
        System.out.println(out.trim());
    }

    private static void runActivity8(Scanner sc) {
        System.out.print("Enter a number (Max 3000): ");
        int num = sc.nextInt();
        if (num < 1 || num > 3000) { System.out.println("Invalid Range!"); return; }
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] romanLetters = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        StringBuilder roman = new StringBuilder();
        for (int i = 0; i < values.length; i++) {
            while (num >= values[i]) { num -= values[i]; roman.append(romanLetters[i]); }
        }
        System.out.println("Roman Numeral Output: " + roman);
    }

    private static void runActivity9(Scanner sc) {
        System.out.print("Enter tuition fee: ");
        double fee = sc.nextDouble();
        System.out.print("Enter mode of payment (1=Cash, 2=Two-Installment, 3=Three-Installment): ");
        int mode = sc.nextInt();
        double total = fee;
        if (mode == 1) total = fee * 0.90;
        else if (mode == 2) total = fee * 0.95;
        else if (mode == 3) total = fee * 1.10;
        System.out.printf("Your total tuition fee is: %,.2f%n", total);
    }

    private static void runActivity10(Scanner sc) {
        System.out.print("Enter numeric percentile grade: ");

int g = sc.nextInt();
if (g >= 98 && g <= 100) System.out.println("Grade: 1.00");
else if (g >= 95 && g <= 97) System.out.println("Grade: 1.25");
else if (g >= 92 && g <= 94) System.out.println("Grade: 1.50");
else if (g >= 89 && g <= 91) System.out.println("Grade: 1.75");
else if (g >= 85 && g <= 88) System.out.println("Grade: 2.00");
else if (g >= 82 && g <= 84) System.out.println("Grade: 2.25");
else if (g >= 80 && g <= 81) System.out.println("Grade: 2.50");
else if (g >= 77 && g <= 79) System.out.println("Grade: 2.75");
else if (g >= 75 && g <= 76) System.out.println("Grade: 3.00");
else System.out.println("Out-of-Range");
}
private static void runActivity11() {
System.out.println("Sequence nos.\tSquared");
for (int i = 1; i <= 5; i++) {
System.out.println(i + "\t\t" + (i * i));
}
}
private static void runActivity12() {
int left = 1, right = 5;
while (left <= 5) {
System.out.print(left + ", " + right + ", ");
left++; right--;
}
System.out.println();
}
private static void runActivity13() {
int left = 5, right = 1;
while (left >= 1) {
System.out.print(left + ", " + right + ", ");
left--; right++;
}
System.out.println();
}
private static void runActivity14(Scanner sc) {
System.out.print("Enter a no.: ");
int n = sc.nextInt();
int fact = 1;
for (int i = 1; i <= n; i++) { fact *= i; }
System.out.println("Factorial value: " + fact);
}
private static void runActivity15(Scanner sc) {
System.out.print("Enter terms count no.: ");
int n = sc.nextInt();
int t1 = 1, t2 = 1;
System.out.print("Fibonacci series: ");
for (int i = 1; i <= n; ++i) {
System.out.print(t1 + " ");
int sum = t1 + t2; t1 = t2; t2 = sum;
}
System.out.println();
}
private static void runActivity16(Scanner sc) {
System.out.print("Enter base no.: ");
int base = sc.nextInt();
System.out.print("Enter exponent no.: ");
int exp = sc.nextInt();
long result = 1;
for (int i = 1; i <= exp; i++) { result *= base; }
System.out.println("Power value: " + result);
}
private static void runActivity17(Scanner sc) {
System.out.print("Enter n value: ");
int n = sc.nextInt();
int sum = 0;
for (int i = 1; i <= n; i++) { sum += (i * i); }
System.out.println("Sum of squares result: " + sum);
}
private static void runActivity18(Scanner sc) {
System.out.print("Enter terminal check limit: ");
int n = sc.nextInt();
int sum = 0;
for (int i = 1; i <= n; i++) { sum += i; }
System.out.println("Sequence sum: " + sum);
}
private static void runActivity19(Scanner sc) {
System.out.print("Enter a number: ");
int num = sc.nextInt(), reversed = 0;
while (num != 0) {
int digit = num % 10; reversed = reversed * 10 + digit; num /= 10;
}
System.out.println("Reverse number: " + reversed);
}
private static void runActivity20(Scanner sc) {
System.out.print("Enter terminal iteration row value: ");
int n = sc.nextInt();
long totalSum = 0;
for (int i = 1; i <= n; i++) {
long power = 1;
for (int j = 1; j <= i; j++) { power *= i; }
totalSum += power;
}
System.out.println("Sum of powers outcome: " + totalSum);
}
private static void runActivity21(Scanner sc) {
System.out.print("Enter structural row height: ");
int r = sc.nextInt();
for (int i = 1; i <= r; i++) {
for (int j = 1; j <= i; j++) System.out.print("* ");
System.out.println();
}
}
private static void runActivity22(Scanner sc) {
System.out.print("Enter row matrix ceiling count: ");
int r = sc.nextInt();
for (int i = 1; i <= r; i++) {
for (int j = 1; j <= i; j++) System.out.print(((i + j) % 2 == 0 ? "1 " : "0 "));
System.out.println();
}
}
private static void runActivity23(Scanner sc) {
System.out.print("Enter pyramid row size index: ");
int r = sc.nextInt();
for (int i = 1; i <= r; i++) {
for (int j = 1; j <= r - i; j++) System.out.print(" ");
for (int k = 1; k <= (2 * i - 1); k++) System.out.print("*");
System.out.println();
}
}
private static void runActivity24(Scanner sc) {
System.out.print("Enter matrix levels index: ");
int r = sc.nextInt();
for (int i = 1; i <= r; i++) {
for (int j = 1; j <= r - i; j++) System.out.print(" ");
for (int k = 1; k <= i; k++) System.out.print(i + " ");
System.out.println();
}
}
private static void runActivity25(Scanner sc) {
System.out.print("Enter dynamic spacing rows size: ");
int r = sc.nextInt();
for (int i = 1; i <= r; i++) {
for (int j = 1; j <= r - i; j++) System.out.print(" ");
for (int k = 1; k <= i; k++) System.out.print("* ");
System.out.println();
}
}
private static void runActivity26(Scanner sc) {
System.out.print("Enter running dynamic row height: ");
int r = sc.nextInt(), val = 1;
for (int i = 1; i <= r; i++) {
for (int j = 1; j <= r - i; j++) System.out.print(" ");
for (int k = 1; k <= i; k++) System.out.print((val++) + " ");
System.out.println();
}
}
private static void runActivity27(Scanner sc) {
System.out.print("Enter continuous counting baseline: ");
int r = sc.nextInt(), val = 1;
for (int i = 1; i <= r; i++) {
for (int j = 1; j <= i; j++) System.out.print((val++) + " ");
System.out.println();
}
}
private static void runActivity28(Scanner sc) {
System.out.print("Enter repetitive structural dimension rows: ");
int r = sc.nextInt();
for (int i = 1; i <= r; i++) {
for (int j = 1; j <= i; j++) System.out.print(i + " ");
System.out.println();
}
}
private static void runActivity29(Scanner sc) {
System.out.print("Enter serial incremental dynamic base ceiling: ");
int r = sc.nextInt();
for (int i = 1; i <= r; i++) {
for (int j = 1; j <= i; j++) System.out.print(j + " ");
System.out.println();
}
}
private static void runActivity30(Scanner sc) {
System.out.print("Enter terminal diamond radius: ");
int n = sc.nextInt();
for (int i = 1; i <= n; i++) {
for (int j = 1; j <= n - i; j++) System.out.print(" ");
for (int k = 1; k <= (2 * i - 1); k++) System.out.print("");
System.out.println();
}
for (int i = n - 1; i >= 1; i--) {
for (int j = 1; j <= n - i; j++) System.out.print(" ");
for (int k = 1; k <= (2 * i - 1); k++) System.out.print("");
System.out.println();
}
}
private static void runActivity31(Scanner sc) {
System.out.print("Enter rows count index bounds: ");
int r = sc.nextInt();
for (int i = 1; i <= r; i++) {
for (int j = 1; j <= r - i; j++) System.out.print("  ");
for (int j = 1; j <= i; j++) System.out.print(j + " ");
for (int j = i - 1; j >= 1; j--) System.out.print(j + " ");
System.out.println();
}
}
}
