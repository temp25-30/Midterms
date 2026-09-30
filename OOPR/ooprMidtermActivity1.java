import java.util.Scanner;

class Program_1{
    public static void prog(){
        Scanner scanner = new Scanner(System.in);
        double[] numbers = new double[10];
        
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number: ");
            numbers[i] = scanner.nextDouble();
        }
       
        double sumPositive = 0.0;
        int countPositive = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0) {
                sumPositive += numbers[i];
                countPositive++;
            }
        }
        
        int countNegative = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0) {
                countNegative++;
            }
        }
        
        double minValue = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < minValue) {
                minValue = numbers[i];
            }
        }
            
        double avgPositive = sumPositive / countPositive;
        System.out.println("Sum of positive numbers: " + sumPositive);
        System.out.println("Average of positive numbers: " + avgPositive);
        System.out.println("Number of negative numbers: " + countNegative);
    }
}

class Program2{
    public static void prog(){
        Scanner input = new Scanner(System.in);
        int[] array = new int[8];
        for(int i=0;i<8;i++){
            System.out.print("Enter Number: ");
            array[i]=input.nextInt();
        }
        int[] uniquearray = Arrays.stream(array).distinct().toArray();
        int largest=Integer.MIN_VALUE,secondlargest=Integer.MIN_VALUE,smallest=Integer.MAX_VALUE,secondsmallest=Integer.MAX_VALUE;
        for(int i=0;i<uniquearray.length;i++){
            if(array[i]>largest){largest=array[i];}
            if(array[i]<smallest){smallest=array[i];}
        }
        for(int i=0;i<uniquearray.length;i++){
            if(array[i]>secondlargest&&array[i]<largest){secondlargest=array[i];}
            if(array[i]<secondsmallest&&array[i]>smallest){secondsmallest=array[i];}
        }
        System.out.print("Unique Array Elements: ");
        for(int i=0;i<uniquearray.length;i++){
            System.out.print(uniquearray[i]+" ");
        }
        System.out.println("\nSecond Largest Number: "+secondlargest+"\nSecond Smallest Number: "+secondsmallest);
    }    
}

class Program3{
    public static int[] remove(int[] arr, int i){      
        if (arr == null || i < 0 || i >= arr.length)
            return arr;
        int[] arr1 = new int[arr.length - 1];
        System.arraycopy(arr, 0, arr1, 0, i);

        System.arraycopy(arr, i + 1,
                        arr1, i,
                        arr.length - i - 1);
        return arr1;
    }
    
    public static void prog(){
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[5];
        for(int i =0; i<5;i++){
            System.out.print("Input numbers: ");
            numbers[i] = input.nextInt();
        }
        
        System.out.println("Stored Numbers: ");
        for(int i =0; i<5;i++){
            System.out.print(numbers[i] + " ");
        }

        System.out.print("\nEnter pos. to be removed from array: ");
        int nRev = input.nextInt();
        numbers = remove(numbers, nRev);
        
        System.out.print("New numbers: ");
        for(int i =0; i<4;i++){
            System.out.print(numbers[i]+" ");
        }
        
    }
}

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
