package com.mycompany.midtermactivity1;
import java.util.Scanner;
import java.util.Arrays;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
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

class Program5{
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

class Program6{
    protected static int numOfStudents = 0;
        
    public static int getNumOfStudents(){
            return numOfStudents;
    } 
     
    protected static void setNumOfStudents(int incrementalNum){
            numOfStudents += incrementalNum;
    }
    
    static class student{
        private String studentNo;
        private String studentName;
        private String dateOfBirth;
        private int tariffPoints = 20;

        public student(){
            this.studentNo = "Not Known.";
            this.studentName = "Not Known.";
            this.dateOfBirth = "1st January 1995";
            this.tariffPoints = 20; 
            Program6.setNumOfStudents(1);
        }
        
        public student(String studentNo, String studentName, String dateOfBirth, int tariffPoints){
            this.studentNo = studentNo;
            this.studentName = studentName;
            this.dateOfBirth = dateOfBirth;
            this.tariffPoints = tariffPoints; 
            Program6.setNumOfStudents(1);
        }
        
        public String getStudentNo(){
            return this.studentNo;
        }
        
        public String getStudentName(){
            return this.studentName;
        }
        
        public String getDateOfBirth(){
            return this.dateOfBirth;
        }
        
        public int getTariffPoints(){
            return this.tariffPoints;
        }
        
        public void setStudentNo(String studentNo) {
            this.studentNo = studentNo;
        }

        public void setStudentName(String studentName) {
            this.studentName = studentName;
        }

        public void setDateOfBirth(String dateOfBirth) {
            this.dateOfBirth = dateOfBirth;
        }

        public void setTariffPoints(int tariffPoints) {
            this.tariffPoints = tariffPoints;
        }
    }
    
    public static void prog(){
        student st1 = new student("0125001406", "John Jose Jacinto", "9th September 2006", 96);
        
        student st2 = new student();
        
        System.out.println("4 Parameter Constructor:\n"+st1.studentNo +" "+ st1.studentName +" "+ st1.dateOfBirth +" "+ st1.tariffPoints + "\n");
        System.out.println("Default Constructor:\n"+st2.studentNo +" "+ st2.studentName +" "+ st2.dateOfBirth +" "+ st2.tariffPoints);
    }
}

class Program7{
    public static void prog(){
        String filePath = "data.txt";

        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))){
            String line;
            while((line = reader.readLine()) != null){               
                System.out.println(line);
            }
        }
        catch(FileNotFoundException e){
            System.out.println("Could not locate file");
        }
        catch(IOException e){
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }
}

public class MidtermActivity1 {
    protected static boolean selection = true;
    public static void askCont(){
        Scanner input = new Scanner(System.in);
        System.out.print("Would you like to continue? Y/N: ");
        char letter = input.next().charAt(0);
        char lowLetter = Character.toLowerCase(letter);
        if(lowLetter == 'y'){
            selection = false;
        }
        else{
            selection = true;
        }
    }
    
    public static void selectionMenu(){
        Scanner input = new Scanner(System.in);
        int selected = 1;
        while(selection == true){
            System.out.println("Select program to be run:\nProgram 1.\nProgram 2.\nProgram 3.\nProgram 4.\nProgram 5.\nProgram 6.\nProgram 7.\nExit 8.");
            selected = input.nextInt();
            
            askCont();  
        }
        switch(selected){
                case 1:
                    Program_1.prog();
                    break;
                case 2:
                    Program2.prog();
                    break;
                case 3:
                    Program3.prog();
                    break;
                case 4:
                    Program4.prog();
                    break;
                case 5:
                    Program5.prog();
                    break;
                case 6:
                    Program6.prog();
                    break;
                case 7:
                    Program7.prog();
                    break;
                case 8:
                    System.out.print("Exiting System...");
                    break;
                default:
                    selectionMenu();
                    break;
        }
    }
    
    public static void main(String args[]) {
        selectionMenu();
    }
}
