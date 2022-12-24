package loiane.exercise;

import java.util.Scanner;

public class ExerciseFourteen {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the total weight of the fish:");
        var weight = scan.nextFloat();

        var xs = weight >= 50 ? weight - 50 : 0;
        System.out.printf("the weight xs is %.2f\nThe amount of the fine is %.2f", xs, xs*4);
    }
}
