import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class WEEK8_javaProgramsPractice {

    public static void main(String[] args) {
        Scanner mainScanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n==================================================");
            System.out.println("            JAVA PROGRAMS MENU SYSTEM             ");
            System.out.println("==================================================");
            System.out.println("1. Display odd numbers between 1-100");
            System.out.println("2. Sum of odd numbers between 1-100");
            System.out.println("3. Total number of odd numbers between 1-100");
            System.out.println("4. Find sum of first n numbers");
            System.out.println("5. Find the sum of the digits of a number");
            System.out.println("6. Calculate electricity bill");
            System.out.println("7. Find Armstrong number");
            System.out.println("8. Print Armstrong numbers between 1 to 1000");
            System.out.println("9. Print given number in words");
            System.out.println("10. Check if a given number is Palindrome or not");
            System.out.println("11. Print palindrome numbers upto N numbers");
            System.out.println("12. Print N prime numbers and find sum and average");
            System.out.println("13. Pyramid Pattern 1 (Stars)");
            System.out.println("14. Pyramid Pattern 2 (Aligned Stars)");
            System.out.println("15. Different Pattern Programs 1 (Star Hourglass)");
            System.out.println("16. Print Floyd's Triangle");
            System.out.println("17. Print numbers in sequence way");
            System.out.println("18. Print numbers in triangle and pyramid vice");
            System.out.println("19. Pattern Number Pyramid Upto N");
            System.out.println("20. Pattern Number Pyramid");
            System.out.println("21. Pattern Number Pyramid Arrow");
            System.out.println("22. Pattern Number Pyramid Rev");
            System.out.println("23. Print different patterns using stars (Star1)");
            System.out.println("24. Star Pattern 3 (Star3)");
            System.out.println("25. Print pyramid triangle with star and numbers (Star10)");
            System.out.println("26. Find largest number in an array");
            System.out.println("27. Find second largest number in an array");
            System.out.println("28. Find largest and smallest number in an array");
            System.out.println("29. Find largest and second largest in an array");
            System.out.println("30. Find the index of the largest number in an array");
            System.out.println("31. Find the index of the smallest number in an array");
            System.out.println("32. Remove duplicate element in an array");
            System.out.println("33. Print odd and even numbers from an array");
            System.out.println("34. Add two matrices");
            System.out.println("35. Check given matrix is null matrix");
            System.out.println("36. Check given matrix is diagonal matrix");
            System.out.println("37. Linear search");
            System.out.println("38. Binary search");
            System.out.println("39. Calculate HCF and LCM");
            System.out.println("40. Find volume of cube");
            System.out.println("41. Print the reverse of a given number");
            System.out.println("42. Convert integer to roman letters");
            System.out.println("43. Count number of words in given string");
            System.out.println("44. Count number of duplicate words in given string");
            System.out.println("45. Remove duplicate words in given string");
            System.out.println("46. Count each word and total number of words");
            System.out.println("47. Reverse string and check if it is palindrome");
            System.out.println("48. Delete vowels in a given string");
            System.out.println("49. Capitalize first letter of each word in string");
            System.out.println("50. Split a comma-separated string");
            System.out.println("51. Convert ASCII value to String");
            System.out.println("52. Replace vowels with star");
            System.out.println("53. Print character position count in a string");
            System.out.println("54. Print reversed string by word in given line");
            System.out.println("55. Returning a string as reverse text");
            System.out.println("56. Find difference of min and max numbers of array");
            System.out.println("57. Count the occurrences of each character");
            System.out.println("0. Exit Application");
            System.out.print("Enter your choice: ");

            int choice = mainScanner.nextInt();
            System.out.println("\n--- Program Output ---");

            switch (choice) {
                case 0:
                    System.out.println("Exiting application. Goodbye!");
                    mainScanner.close();
                    return;
                case 1: runOddNumber(); break;
                case 2: runSumOfNum(); break;
                case 3: runTotalNumOfOddNum(); break;
                case 4: runSumOfFirstN(); break;
                case 5: runDigitsSum(); break;
                case 6: runElectricBill(); break;
                case 7: runArmstrongNumber(); break;
                case 8: runArmstrongNumbersRange(); break;
                case 9: runNumberToWords(); break;
                case 10: runPalindromeNumberCheck(); break;
                case 11: runPalindromeUptoN(); break;
                case 12: runPrimeNumberUptoN(); break;
                case 13: runPyramidPattern1(); break;
                case 14: runPyramidPattern2(); break;
                case 15: runDifferentPatternPrograms1(); break;
                case 16: runFloydsTriangle(); break;
                case 17: runPatternNumberSequence(); break;
                case 18: runPatternNumberPyramidPrevRev(); break;
                case 19: runPatternNumberPyramidUptoN(); break;
                case 20: runPatternNumberPyramid(); break;
                case 21: runPatternNumberPyramidArrow(); break;
                case 22: runPatternNumberPyramidRev(); break;
                case 23: runStar1(); break;
                case 24: runStar3(); break;
                case 25: runStar10(); break;
                case 26: runLargestNumber(); break;
                case 27: runSecondLargest(); break;
                case 28: runLargestSmallest(); break;
                case 29: runLargestAndSecondLargest(); break;
                case 30: runLargestNumberIndex(); break;
                case 31: runSmallestNumberIndex(); break;
                case 32: runRemoveDuplicateElements(); break;
                case 33: runOddEvenArray(); break;
                case 34: runMatrixAddition(); break;
                case 35: runNullMatrix(); break;
                case 36: runDiagonalMatrix(); break;
                case 37: runLinearSearch(); break;
                case 38: runBinarySearch(); break;
                case 39: runFindHCFAndLCM(); break;
                case 40: runCube(); break;
                case 41: runReverseNum(); break;
                case 42: runIntegertoRoman(); break;
                case 43: runWordCount(); break;
                case 44: runCountWords(); break;
                case 45: runRemoveDuplicate(); break;
                case 46: runFindTotalCountWords(); break;
                case 47: runPalindromeChecking(); break;
                case 48: runRemoveAllVowels(); break;
                case 49: runStringCapital(); break;
                case 50: runCommaSeparated(); break;
                case 51: runAsciiToCharacter(); break;
                case 52: runVowelsWithStar(); break;
                case 53: runLetterPositionCount(); break;
                case 54: runReverseWord(); break;
                case 55: runStringReverse(); break;
                case 56: runExArrayDifference(); break;
                case 57: runNoOfOccurenceOfCharacters(); break;
                default:
                    System.out.println("Invalid logic selection. Please try again.");
            }
            System.out.println("\n-----------------------");
        }
    }

    // 1. Display odd numbers between 1-100
    private static void runOddNumber() {
        System.out.println("The Odd Numbers are:");
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    // 2. Sum of odd numbers between 1-100
    private static void runSumOfNum() {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                sum = sum + i;
            }
        }
        System.out.println("The Sum Of 100 Odd Numbers are:" + sum);
    }

    // 3. Total number of odd numbers between 1-100
    private static void runTotalNumOfOddNum() {
        int count = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                count++;
            }
        }
        System.out.println("The Count Of Odd Numbers are:" + count);
    }

    // 4. Find sum of first n numbers
    private static void runSumOfFirstN() {
        int sum = 0;
        int n = 10;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        System.out.println("The Sum Of " + n + " Numbers are:" + sum);
    }

    // 5. Find the sum of the digits of a number
    private static void runDigitsSum() {
        int num = 251025, rem = 0, sum = 0, temp;
        temp = num;
        while (num > 0) {
            rem = num % 10;
            sum = sum + rem;
            num = num / 10;
        }

System.out.print("Sum of Digits of " + temp + " is " + sum);
System.out.println();
}
// 6. Calculate electricity bill
private static void runElectricBill() {
int units = 123;
int bill = 0;
if (units > 100) {
if (units >= 200) {
if (units > 300) {
bill = units * 8;
} else {
bill = units * 6;
}
} else {
bill = units * 5;
}
}
System.out.println("CHENNAI ELECTRICITY LTD, CHENNAI");
System.out.println("Units Consumed: " + units);
System.out.println("Total Bill: " + bill);
}
// 7. Java program to find Armstrong number
private static void runArmstrongNumber() {
int n, arg, sum = 0, r;
n = 153;
arg = n;
while (n > 0) {
r = n % 10;
sum = sum + (r * r * r);
n = n / 10;
}
if (arg == sum) {
System.out.println("Given number is armstrong number: " + arg);
} else {
System.out.println("Given number is not armstrong number: " + arg);
}
}
// 8. Program to print Armstrong number between 1 to 1000
private static void runArmstrongNumbersRange() {
int num, rem, limit = 1000, sum = 0;
System.out.print("Armstrong numbers from 1 to N: ");
for (int i = 1; i <= limit; i++) {
num = i;
while (num > 0) {
rem = num % 10;
sum = sum + (rem * rem * rem);
num = num / 10;
}
if (sum == i) {
System.out.print(i + " ");
}
sum = 0;
}
System.out.println();
}
// 9. Print given number in words Helper & execution
private static void pw(int n, String ch) {
String one[] = { "", "One", "Two", " Three", " Four", " Five", " Six", " Seven", " Eight", " Nine", " Ten"," Eleven", " Twelve", " Thirteen", " Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen"," Nineteen" };
String ten[] = { "", "", "Twenty", " Thirty", " Forty", " Fifty", " Sixty", "Seventy", " Eighty", "Ninety" };
if (n > 19) {
System.out.print(ten[n / 10] + " " + one[n % 10]);
} else {
System.out.print(one[n]);
}
if (n > 0) System.out.print(ch);
}
private static void runNumberToWords() {
int n = 28;
System.out.print(n + " -> ");
if (n <= 0) {
System.out.println("Enter numbers greater than 0");
} else {
pw((n / 100000000), " Hundred");
pw((n / 1000000) % 100, " crore");
pw(((n / 10000) % 100), " lakh");
pw(((n / 1000) % 100), " thousand");
pw(((n / 100) % 10), " hundred");
pw((n % 100), " ");
System.out.println();
}
}
// 10. Program to check the given number is Palindrome or not
private static void runPalindromeNumberCheck() {
int n = 121, pal, r, rev = 0;
pal = n;
while (n > 0) {
r = n % 10;
rev = rev * 10 + r;
n = n / 10;
}
if (rev == pal) {
System.out.println("The given no is palindrome " + rev);
} else {
System.out.println("The given no is not palindrome " + rev);
}
}
// 11. Program to print palindrome number upto N numbers
private static void runPalindromeUptoN() {
int n, b, rev = 0;
int limit = 50;
System.out.print("Palindrome numbers from 1 to N: ");
for (int i = 1; i <= limit; i++) {
n = i;
while (n > 0) {
b = n % 10;
rev = rev * 10 + b;
n = n / 10;
}
if (rev == i) {
System.out.print(i + " ");
}
rev = 0;
}
System.out.println();
}
// 12. Program to print N prime numbers and find sum and average
private static void runPrimeNumberUptoN() {
int num = 0, i = 0;
System.out.println("Prime numbers from 1 to 100 are:");
for (i = 1; i <= 100; i++) {
int counter = 0;
for (num = i; num >= 1; num--) {
if (i % num == 0) {
counter = counter + 1;
}
}
if (counter == 2) {
System.out.print(i + " ");
}
}
System.out.println();
}
// 13. Program to print patterns of numbers and stars
private static void runPyramidPattern1() {
int n = 4;
for (int i = 0; i < n; i++) {
for (int j = 0; j <= i; j++) {
System.out.print(" * ");
}
System.out.println();
}
}
// 14. PyramidPattern2
private static void runPyramidPattern2() {
int i, j, k = 8;
for (i = 0; i < 5; i++) {
for (j = 0; j < k; j++) {
System.out.print(" ");
}
k = k - 2;
for (j = 0; j <= i; j++) {
System.out.print("* ");
}
System.out.println();
}
}
// 15. DifferentPattern Programs 1
private static void runDifferentPatternPrograms1() {
int n = 5; // Simulating scanner inputs to prevent interactive blocks inside choices
int i, j, k, l, m, p, q;
p = n; q = n;
for (i = n; i >= 1; i--) {
for (j = 1; j <= i; j++) { System.out.print(""); }
for (k = p * 2; k < n * 2 - 1; k++) { System.out.print(" "); }
for (l = i; l != 0; l--) {
if (l == n) continue;
System.out.print("");
}
p--;
System.out.println();
}
for (i = 1; i <= n; i++) {
for (j = 1; j <= i; j++) { System.out.print(""); }
for (k = q * 2 - 2; k > 1; k--) { System.out.print(" "); }
for (m = i; m != 0; m--) {
if (m == n) continue;
System.out.print("");
}
System.out.println();
q--;
}
}
// 16. Print Floyds triangle
private static void runFloydsTriangle() {
int rows = 5;
System.out.println("Floyd's Triangle Generated (Rows: " + rows + "):");
int count = 1;
for (int i = 1; i <= rows; i++) {
for (int j = 1; j <= i; j++) {
System.out.print(count + " ");
count++;
}
System.out.println();
}
}
// 17. Print numbers in sequence way
private static void runPatternNumberSequence() {
int a = 3, b = 4, n = 8;
for (int i = 1; i <= n; i++) {
int c = a + b;
System.out.println(a + " " + b + " " + c);
a = c;
b = b + 1;
}
}
// 18. Print numbers in triangle and pyramid vice
private static void runPatternNumberPyramidPrevRev() {
int n = 5;
for (int i = 1; i <= n; i++) {
int s = 1;
while (s <= i) {
System.out.print(s);
s++;
}
s--;
while (s > 1) {
System.out.print(--s);
}
System.out.println();
}
}
// 19. PatternNumberPyramidUptoN
private static void runPatternNumberPyramidUptoN() {
int i, j, n = 1;
for (i = 0; i < 5; i++) {
for (j = 0; j <= i; j++) {
System.out.print(n + " ");
n++;
}
System.out.println();
}
}
// 20. Pattern NumberPyramid
private static void runPatternNumberPyramid() {
int n = 5;
for (int i = 1; i <= n; i++) {
for (int j = 1; j <= i; j++) {
System.out.print(" " + j);
}
System.out.print("\n");
}
}
// 21. PatternNumberPyramidArrow
private static void runPatternNumberPyramidArrow() {
int n = 5;
for (int i = 1; i <= n; i++) {
for (int j = 1; j <= i; j++) System.out.print(" " + j);
System.out.print("\n");
}
for (int i = n - 1; i >= 1; i--) {
for (int j = 1; j <= i; j++) System.out.print(" " + j);
System.out.print("\n");
}
}
// 22. PatternNumberPyramidRev
private static void runPatternNumberPyramidRev() {
int n = 5, a = n;
for (int i = 1; i <= n; i++) {
for (int j = a; j > 1; j--) { System.out.print(" "); }
for (int k = i; k != 0; k--) { System.out.print(k); }
a--;
for (int l = 2; l <= i; l++) { System.out.print(l); }
System.out.println();
}
}
// 23. Print different patterns using stars (Star1)
private static void runStar1() {
int t = 5;
for (int j = 0; j < t; j++) {
for (int i = t - 1; i >= j; i--) {
System.out.print("*");
}
System.out.println("");
}
}
// 24. Star3
private static void runStar3() {
int i, j, k, n = 3;
for (i = 0; i < n; i++) {
for (j = 0; j <= i; j++) { System.out.print(""); }
for (j = (n - i); j >= 2; j--) { System.out.print(" "); }
for (k = i; k >= 0; k--) { System.out.print(""); }
System.out.println();
}
}
// 25. Star10
private static void runStar10() {
int i, j, k;
for (i = 1; i <= 5; i++) {
for (j = i; j < 5; j++) { System.out.print(" "); }
for (k = 1; k < (i * 2); k++) { System.out.print(""); }
System.out.println("");
}
for (i = 4; i >= 1; i--) {
for (j = 5; j > i; j--) { System.out.print(" "); }
for (k = 1; k < (i * 2); k++) { System.out.print(""); }
System.out.println("");
}
}
// 26. Program to find largest number in an array
private static void runLargestNumber() {
int[] a = new int[] { 20, 30, 50, 4, 71, 100 };
int max = a[0];
for (int i = 1; i < a.length; i++) {
if (a[i] > max) { max = a[i]; }
}
System.out.println("From The Array Element Largest Number is: " + max);
}
// 27. Program to find second largest number in an array
private static void runSecondLargest() {
int arr[] = { 14, 46, 47, 86, 92, 52, 48, 36, 66, 85 };
int largest = arr[0];
int secondLargest = arr[0];
for (int i = 0; i < arr.length; i++) {
if (arr[i] > largest) {
secondLargest = largest;
largest = arr[i];
} else if (arr[i] > secondLargest && arr[i] != largest) {
secondLargest = arr[i];
}
}
System.out.println("Second largest number is: " + secondLargest);
}
// 28. Find largest and smallest number in an array in java
private static void runLargestSmallest() {
int a[] = new int[] { 23, 34, 13, 64, 72, 90, 10, 15, 9, 27 };
int min = a[0];
int max = a[0];
for (int i = 1; i < a.length; i++) {
if (a[i] > max) { max = a[i]; }
if (a[i] < min) { min = a[i]; }
}
System.out.println("Largest Number: " + max + " | Smallest Number: " + min);
}
// 29. Program to find largest and second largest in an array
private static void runLargestAndSecondLargest() {
int nums[] = { 5, 34, 78, 2, 45, 1, 99, 23 };
int maxOne = 0, maxTwo = 0;
for (int i = 0; i < nums.length; i++) {
if (maxOne < nums[i]) {
maxTwo = maxOne;
maxOne = nums[i];
} else if (maxTwo < nums[i]) {
maxTwo = nums[i];
}
}
System.out.println("Largest Number: " + maxOne + " | Second Largest: " + maxTwo);
}
// 30. Find the index of the largest number in an array
private static void runLargestNumberIndex() {
int a[] = new int[] { 12, 44, 23, 56, 23, 78, 13 };
int max = a[0], index = 0;
for (int i = 0; i < a.length; i++) {
if (max < a[i]) {
max = a[i];
index = i;
}
}
System.out.println("Index position of Maximum value is: " + index);
}
// 31. Find the index of the smallest number in an array
private static void runSmallestNumberIndex() {
int a[] = new int[] { 12, 44, 23, 56, 9, 23, 78, 13 };
int min = a[0], index = 0;
for (int i = 0; i < a.length; i++) {
if (min > a[i]) {
min = a[i];
index = i;
}
}
System.out.println("Index position of Smallest value is: " + index);
}
// 32. Program to remove duplicate element in an array
private static int[] removeDuplicates(int[] input) {
if (input.length < 2) return input;
int j = 0, i = 1;
while (i < input.length) {
if (input[i] == input[j]) { i++; }
else { input[++j] = input[i++]; }
}
int[] output = new int[j + 1];
for (int k = 0; k < output.length; k++) { output[k] = input[k]; }
return output;
}
private static void runRemoveDuplicateElements() {
int[] input1 = { 2, 3, 6, 6, 8, 9, 10, 10, 10, 12, 12 };
int[] output = removeDuplicates(input1);
System.out.print("Output Elements without duplicates: ");
for (int i : output) System.out.print(i + " ");
System.out.println();
}
// 33. Program to print odd and even numbers from an array
private static void runOddEvenArray() {
int s;
int[] a = { 33, 2, 4, 71, 88, 92, 9, 1 };
for (int i = 0; i < a.length; i++) {
for (int j = i + 1; j < a.length; j++) {
if (a[i] > a[j]) {
s = a[i]; a[i] = a[j]; a[j] = s;
}
}
}
System.out.print("\nOdd numbers: ");
for (int i = 0; i < a.length; i++) {
if (a[i] % 2 != 0) System.out.print(a[i] + " ");
}
System.out.print("\nEven numbers: ");
for (int i = 0; i < a.length; i++) {
if (a[i] % 2 == 0) System.out.print(a[i] + " ");
}
System.out.println();
}
// 34. Program to add two matrix
private static void runMatrixAddition() {
int[][] a = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };
int[][] b = { {10, 11, 12}, {13, 14, 15}, {16, 17, 18} };
int[][] c = new int[3][3];
for (int i = 0; i < a.length; i++) {
for (int j = 0; j < a[i].length; j++) {
c[i][j] = a[i][j] + b[i][j];
}
}
System.out.println("The Addition Matrix of 'A' and 'B' Value:");
for (int i = 0; i < c.length; i++) {
for (int j = 0; j < c[i].length; j++) { System.out.print(c[i][j] + " "); }
System.out.println();
}
}
// 35. Program to check given matrix is null matrix
private static void runNullMatrix() {
int[][] a = { {0, 0, 0}, {0, 0, 1}, {0, 0, 0} };
boolean setValue = true;
for (int i = 0; i < a.length; i++) {
for (int j = 0; j < a[i].length; j++) {
if (a[i][j] != 0) { setValue = false; break; }
}
}
System.out.println("The Given Matrix is " + (setValue ? "a Null Matrix" : "not a Null Matrix"));
}
// 36. Program to check given matrix is diagonal matrix
private static void runDiagonalMatrix() {
int[][] a = { {1, 0, 0}, {0, 3, 0}, {0, 0, 3} };
boolean setValue = true;
for (int i = 0; i < a.length; i++) {
for (int j = 0; j < a[i].length; j++) {
if (i == j) {
if (a[i][j] == 0) setValue = false;
} else if (a[i][j] != 0) {
setValue = false;
}
}
}
System.out.println("The Given Matrix is " + (setValue ? "a Diagonal Matrix" : "not a Diagonal Matrix"));
}
// 37. Program for Linear search
private static void runLinearSearch() {
int[] array = {10, 25, 45, 60, 75};
int searchval = 45;
int i;
for (i = 0; i < array.length; i++) {
if (array[i] == searchval) {
System.out.println(searchval + " is present at location " + (i + 1));
break;
}
}
if (i == array.length) System.out.println(searchval + " does not exist.");
}
// 38. Program for Binary Search
private static void runBinarySearch() {
int[] array = {10, 20, 30, 40, 50};
int item = 30;
int first = 0, last = array.length - 1, middle = (first + last) / 2;
while (first <= last) {
if (array[middle] < item) first = middle + 1;
else if (array[middle] == item) {
System.out.println(item + " found at location " + (middle + 1) + ".");
break;
} else last = middle - 1;
middle = (first + last) / 2;
}
if (first > last) System.out.println(item + " is not found.");
}
// 39. Program to calculate HCF and LCM
private static void runFindHCFAndLCM() {
int a, b, x = 6, y = 10, t, hcf, lcm;
a = x; b = y;
while (b != 0) {
t = b; b = a % b; a = t;
}
hcf = a; lcm = (x * y) / hcf;
System.out.println("HCF = " + hcf + " | LCM = " + lcm);
}
// 40. Program to find volume of cube
private static void runCube() {
int side = 5;
float volume = side * side * side;
System.out.println("Volume of Cube: " + volume);
}
// 41. Program to print the reverse of a given number
private static void runReverseNum() {
int rev = 0, num = 1234;
int no = num;
while (num > 0) {
int rem = num % 10;
rev = rem + (rev * 10);
num = num / 10;
}
System.out.println("Original: " + no + " | Reversed: " + rev);
}
// 42. Program to convert integer to roman letters
private static void runIntegertoRoman() {
int no = 27;
int[] bases = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
HashMap<Integer, String> map = new HashMap<>();
map.put(1, "I"); map.put(4, "IV"); map.put(5, "V"); map.put(9, "IX");
map.put(10, "X"); map.put(40, "XL"); map.put(50, "L"); map.put(90, "XC");
map.put(100, "C"); map.put(400, "CD"); map.put(500, "D"); map.put(900, "CM"); map.put(1000, "M");
int temp = no;
String result = "";
for (int i : bases) {
while (temp >= i) {
result += map.get(i);
temp -= i;
}
}
System.out.println(no + " ---> " + result);
}
// 43. Program to count number of words in given string
private static void runWordCount() {
String s = "welcome to candid java tutorial";
int count = 1;
for (int i = 0; i < s.length() - 1; i++) {
if ((s.charAt(i) == ' ') && (s.charAt(i + 1) != ' ')) { count++; }
}
System.out.println("Number of words in a string: " + count);
}
// 44. Program to count number of duplicate words in given string
private static void runCountWords() {
String input = "Welcome to Java Session Session Session";
String[] words = input.split(" ");
int wrc = 1;
for (int i = 0; i < words.length; i++) {
for (int j = i + 1; j < words.length; j++) {
if (words[i].equals(words[j])) {
wrc = wrc + 1; words[j] = "0";
}
}
if (!words[i].equals("0")) {
System.out.println(words[i] + "--" + wrc);
}
wrc = 1;
}
}
// 45. Program to remove duplicate words in given string
private static void runRemoveDuplicate() {
String input = "Welcome to Java Session Java Session Session Java";
String[] words = input.split(" ");
for (int i = 0; i < words.length; i++) {
if (words[i] != null) {
for (int j = i + 1; j < words.length; j++) {
if (words[i].equals(words[j])) { words[j] = null; }
}
}
}
for (String word : words) {
if (word != null) System.out.print(word + " ");
}
System.out.println();
}
// 46. Program to count each words and total number of words
private static void runFindTotalCountWords() {
String st = "apple banana apple fruit fruit apple hello";
String[] words = st.split("\s");
int[] fr = new int[words.length];
for (int i = 0; i < words.length; i++) {
for (int j = 0; j < words.length; j++) {
if (words[i].equals(words[j])) { fr[i]++; }
}
}
for (int i = 0; i < words.length; i++) {
for (int j = 0; j < words.length; j++) {
if (words[i].equals(words[j]) && i != j) { words[i] = ""; }
}
}
int total = 0;
for (int i = 0; i < words.length; i++) {
if (!words[i].equals("")) {
System.out.println(words[i] + "=" + fr[i]);
total += fr[i];
}
}
System.out.println("Total words: " + total);
}
// 47. Program to reverse the string and check whether it is palindrome or not
private static void runPalindromeChecking() {
String inpstr = "AMMA";
char[] inpArray = inpstr.toCharArray();
char[] revArray = new char[inpArray.length];
int j = 0;
for (int i = inpArray.length - 1; i >= 0; i--) { revArray[j] = inpArray[i]; j++; }
String revstr = String.valueOf(revArray);
System.out.println("Is '" + inpstr + "' a Palindrome? " + inpstr.equals(revstr));
}
// 48. Program to delete vowels in a given string
private static void runRemoveAllVowels() {
String string = "Welcome to Candid Java Programming";
string = string.replaceAll("[AaEeIiOoUu]", "");
System.out.println("Result: " + string);
}
// 49. Program to capitalize first letter of each word in string
private static void runStringCapital() {
String str = "welcome to candid java program";
StringBuilder result = new StringBuilder(str.length());

String words[] = str.split("\s");
for(int i = 0; i < words.length; i++) {
result.append(Character.toUpperCase(words[i].charAt(0))).append(words[i].substring(1)).append(" ");
}
System.out.println(result);
}
// 50. Program to split a comma-separated string
private static void runCommaSeparated() {
String input = "Welcome, to, Java, Session";
String[] words = input.split(",");
for (String word : words) System.out.println(word.trim());
}
// 51. Program to convert ASCII value to String
private static void runAsciiToCharacter() {
for (int i = 65; i <= 70; i++) {
System.out.print(i + "=" + (char) i + " ");
}
System.out.println();
}
// 52. Program to replace vowels with star
private static void runVowelsWithStar() {
String string = "Welcome to Candid Java Programming";
string = string.replaceAll("[AaEeIiOoUu]", "*");
System.out.println(string);
}
// 53. Program to print character position count in a given string
private static void runLetterPositionCount() {
String s = "CANDID";
char[] a = s.toCharArray();
int i = 1;
for (char output : a) {
System.out.print(output + " " + i + " ");
i++;
}
System.out.println();
}
// 54. Program to print reversed string by word in given line
private static void runReverseWord() {
String input = "Welcome to Java Session";
String[] words = input.split(" ");
for (int i = words.length - 1; i >= 0; i--) {
System.out.print(words[i] + " ");
}
System.out.println();
}
// 55. Program to returning a string as reverse text
private static void runStringReverse() {
String string = "Welcome to Java Programming";
String[] wordsCount = string.split(" ");
for (int i = wordsCount.length; i > 0; i--) {
System.out.print(wordsCount[i - 1] + " ");
}
System.out.println();
}
// 56. Program to find difference of minimum and maximum numbers of array
private static void runExArrayDifference() {
int arr[] = {10, 45, 2, 99, 23};
int max = arr[0], min = arr[0];
for (int value : arr) {
if (value > max) max = value;
if (value < min) min = value;
}
System.out.println("Max: " + max + " | Min: " + min + " | Difference: " + (max - min));
}
// 57. Program to count the occurrences of each character
private static void runNoOfOccurenceOfCharacters() {
String str = "geeks";
int count[] = new int[256];
for (int i = 0; i < str.length(); i++) count[str.charAt(i)]++;
char ch[] = new char[str.length()];
for (int i = 0; i < str.length(); i++) {
ch[i] = str.charAt(i);
int find = 0;
for (int j = 0; j <= i; j++) {
if (str.charAt(i) == ch[j]) find++;
}
if (find == 1) {
System.out.println("Occurrence of " + str.charAt(i) + " is: " + count[str.charAt(i)]);
}
}
}
}
