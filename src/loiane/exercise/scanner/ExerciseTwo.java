package loiane.exercise.scanner;

import java.util.Scanner;

public class ExerciseTwo {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        System.out.println("Enter a number:");
        int numberOne = scan.nextInt();
        System.out.println("The number entered was " + numberOne);
    }
}
