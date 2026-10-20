import java.util.Scanner;
public class Week9AssignmentNo1 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        String name;
        System.out.print("Input name: "); name = scan.nextLine();
        
        System.out.println("\nWhile Loop:");
        
        int inc = 0;
        while(inc < 5){
            System.out.println(name);
            inc+=1;
        }
        
        System.out.println("\nDo While Loop:");
        int inc2 = 0;
        do{
            System.out.println(name);
            inc2+=1;
        }while(inc2 < 5);
        
        System.out.println("\nFor Loop:");
        for(int i = 0; i<5; i++){
            System.out.println(name);
        }
        
    }
}