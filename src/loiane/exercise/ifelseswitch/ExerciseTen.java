package loiane.exercise.ifelseswitch;

import java.util.Scanner;

public class ExerciseTen {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("What shift do you study?");

        String shift = scan.next();

        switch (shift) {
            case "m":
                System.out.println("Good Morning!");break;
            case "e":
                System.out.println("Good Evening!");break;
            case "n":
                System.out.println("Good Night!");break;
            default:
                System.out.println("Invalid value.");
        }
    }
}
