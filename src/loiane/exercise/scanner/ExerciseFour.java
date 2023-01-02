package loiane.exercise.scanner;

import java.util.Scanner;

public class ExerciseFour {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Type quarterly score");

        System.out.println("First month: ");
        float first = scan.nextFloat();

        System.out.println("Second month: ");
        float second = scan.nextFloat();

        System.out.println("Third month: ");
        float third = scan.nextFloat();

        float average = first + second + third /3;

        System.out.printf("The average score is %.2f", average);




    }
}
