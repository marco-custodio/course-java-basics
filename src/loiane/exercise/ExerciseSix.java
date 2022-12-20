package loiane.exercise;

import java.util.Scanner;

public class ExerciseSix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("What is the radius of the circle? ");
        double radius = scan.nextDouble();

        double area = Math.PI * Math.pow(radius, 2);

        System.out.printf("The area of the circle is %.2f", area);
    }
}
