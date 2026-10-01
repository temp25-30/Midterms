import java.util.Scanner;
public class Week7_Assignment_No1 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();
        
        if(n%2==0){
            System.out.print("Number is Even!");
        }else{
            System.out.print("Number is Odd!");
        }
    }
}
