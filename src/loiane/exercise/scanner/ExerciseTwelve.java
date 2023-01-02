package loiane.exercise.scanner;

import java.util.Scanner;

public class ExerciseTwelve {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Type your height:");
        var height = scan.nextDouble();
        var ideal = (72.7 * height) - 58;

        System.out.printf("Your ideal weight is %.2f", ideal);
    }
}
