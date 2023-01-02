package loiane.exercise.scanner;

import java.util.Scanner;

public class ExerciseThree {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        System.out.println("Enter a number: ");
        int numberOne = scan.nextInt();

        System.out.println("Enter another number: ");
        int numberTwo = scan.nextInt();

        int sum = numberOne + numberTwo;

        System.out.println("The sum of the numbers is " + sum);
    }
}
