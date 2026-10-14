package com.mycompany.oop_midterm_classacitivy_2;
import java.util.Scanner;
public class OOP_MIDTERM_ClassAcitivy_2 {
    
    public static void mainMethod(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your Name: ");
        String uName = scan.nextLine();
        if(!Character.isLetter(uName.charAt(0))){
            System.out.println("Start of name must be an alphabetic letter!");
            mainMethod();
        }
        
        System.out.print("How many pages does the book have?: ");
        double pages = scan.nextInt();
        if(pages<1){
            System.out.println("\nNumber is too small! Try again!");
            mainMethod();
        }
        
        System.out.print("How many pages have you read?: ");
        double readAm = scan.nextInt();
        if(readAm<1){
            System.out.println("\nNumber is too small! Try again!");
            mainMethod();
        }
        
        System.out.print("How many days have been alloted to you?: ");
        int allotedTime = scan.nextInt();
        if(allotedTime<1){
            System.out.println("\nNumber is too small! Try again!");
            mainMethod();
        }
        
        System.out.print("How many days have you been reading?: ");
        int dayReading = scan.nextInt();  
        if(dayReading<1){
            System.out.println("\nNumber is too small! Try again!");
            mainMethod();
        }
                
        String[] dateForm = {"Day", "Month", "Year"};
        int[] dateInt = {1,1,1999};
        int[] months30 = {4,7,9,11}; //April, June, September, November
        int[] months31 = {1,3,5,6,8,10,12}; //January, March, May, July, August, October, December
        
        System.out.println("\n>>Enter Issue Date<<");
        int inc = 0;
        while(inc<3){
            System.out.print("Enter "+dateForm[inc]+": ");
            dateInt[inc] = scan.nextInt();
            //check if date is within the date parameter
            if(dateInt[inc]<1){
                System.out.println("Number is too small! Try again!");
                continue;
            }
            /*
            for(int i = 0; i<4; i++){
                if(dateInt[inc] == months30[i]){
                    if(dateInt[0]>31){
                    System.out.println("\nDay is greater than 31! Try again!");
                    continue;
                    }
                }
            }
            */
            if(dateInt[0]>31){
                System.out.println("\nDay is greater than 31! Try again!");
                continue;
            }
            else if(dateInt[1]>12){
                System.out.println("\nMonth is greater than 12! Try again!");
                continue;
            }
            inc += 1 ;
        }
        
        //Due date
        int daySum = dateInt[0] + allotedTime;
        int monthSum = dateInt[1];
        int yearSum = dateInt[2];
        
        while(daySum>31){
            monthSum += 1;
            daySum -= 31;
        }
        
        while(monthSum > 12){
            yearSum +=1;
            monthSum -= 12;
        }
 
        int[] dateDue = {daySum, monthSum, yearSum};

        double percRead = (readAm/pages)*100;
        int daysRemaining = allotedTime - dayReading;
        double recommededRate = (pages-readAm)/daysRemaining;
        
        //print due date
        System.out.println(">>Result<<");
        System.out.println("Welcome " + uName);
        System.out.print("Due Date: " +dateDue[0]+ ", " +dateDue[1]+", "+dateDue[2]+"\n");

        System.out.println("You have read " + percRead + "% of the book so far.");
        System.out.println("You have " + daysRemaining + " days remaining");
        System.out.println("You should read " +recommededRate+ " pages per day.");
    }
    
    public static void main(String[] args) {
        mainMethod();
    }
}
