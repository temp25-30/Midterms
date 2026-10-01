import java.util.Scanner;
public class Week7_Assignment_No2 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a letter: ");
        char letter = input.next().charAt(0);
        char lowLetter = Character.toLowerCase(letter);
        
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
                
        for(int i =0; i<5; i++){
            if(lowLetter == vowels[i]){
                System.out.print("It is a vowel!");
                break;
            }else{
                System.out.print("It is a consonant!");
                break;
            }
        }
        
    }
}