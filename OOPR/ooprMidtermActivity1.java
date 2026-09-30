package com.mycompany.mavenproject1;

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
        Program_5.prog();
    }
}
