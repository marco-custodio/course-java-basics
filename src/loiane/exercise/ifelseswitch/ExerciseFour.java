package loiane.exercise.ifelseswitch;

import java.util.Scanner;

public class ExerciseFour  {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Type a letter of the alphabet:");

        char letter = scan.next().charAt(0);

        if (letter == 'a' || letter == 'e'|| letter == 'i' || letter == 'o' || letter == 'u' ||
                letter == 'A' || letter == 'E'|| letter == 'I' || letter == 'O' || letter == 'U'){
            System.out.println("This letter is a vowel");
        }else {
            System.out.println("This letter is a consonant");
        }
    }
}
