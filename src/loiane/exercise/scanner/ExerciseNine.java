package loiane.exercise.scanner;

import java.util.Scanner;

public class ExerciseNine {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the temperature in Fahrenheit: ");
        float fah = scan.nextFloat();
        float cel = (5* (fah-32) /9);

        System.out.printf("The temperature in degrees celsius is %.2f", cel);
    }
}
