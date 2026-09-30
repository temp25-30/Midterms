import java.util.Scanner;
class Program4{
    public static void prog(){
        Scanner input = new Scanner(System.in);
        System.out.print("Input size of array: ");
        int n = input.nextInt();
        
        int[] numbers = new int[n];
        for(int i =0; i<n;i++){
            System.out.print("Input size of array: ");
            numbers[i] = input.nextInt();
        }
        
        int[] evens = new int[n];
        int totalEv = 0;
        int[] odds = new int[n];
        int totalOd = 0;
        for(int i =0; i<n;i++){
            if(numbers[i]%2==0){
                evens[totalEv] = numbers[i];
                totalEv += 1;
            }else{
                odds[totalOd] = numbers[i];
                totalOd += 1;                
            }
        }
        
        System.out.println("\nEven numbers: ");       
        for(int i =0; i<totalEv;i++){
            System.out.println(evens[i]+" ");
        }
        System.out.println("\nOdd numbers: ");
        for(int i =0; i<totalOd;i++){
            System.out.println(odds[i]+" ");
        } 
    }
}

class Program_5{
    public static void prog(){
        for(int i = 0; i<4; i++){
            for(int j = 0; j<=i; j++){
                if(j == 0){
                    System.out.print("*");      
                }else{
                    System.out.print("A*");
                }
            }
            System.out.print("\n");
        }
    }
}
public class ooprMidtermActivity1 {
    public static void main(String args[]) {
        //Program_5.prog();
    }
}
