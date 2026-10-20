import java.util.Scanner;
public class Week9AssignmentNo2 {
    public static void main(String args[]) {
        boolean running = true;
        while(running  == true){
            Scanner scan = new Scanner(System.in);
            int iNum;
            System.out.print("\nEnter a number from 1-10: "); iNum = scan.nextInt();
            switch(iNum){
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
                case 10:
                    System.out.println("Ten");
                    break;
                default:
                    System.out.println("Invalid Number");
                    break;
            }
            
            String ans;
            System.out.print("Again? y/n: "); 
            ans = scan.next();
            
            if("n".equals(ans)){
                System.out.println("Exiting....................");
                running = false;
            }else if("y".equals(ans)){
                System.out.println("ok");
            }
        }   

    }
}
