package loiane.exercise.scanner;

import java.util.Scanner;

public class ExerciseTen {
    public static void main(String[] args) {
        var scan = new Scanner(System.in);

        System.out.println("Enter the temperature in Celsius: ");
        var fah = scan.nextFloat();
        var cel = (fah * 9/5) + 32;

        System.out.printf("%.2f degrees in celcius corresponds to %.2f degrees in fahrenheit ", fah, cel);

    }
}
