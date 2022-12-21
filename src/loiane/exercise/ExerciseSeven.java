package loiane.exercise;

import java.util.Scanner;

public class ExerciseSeven {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("What is the area of the square? What twice the area?");

        System.out.println("Enter the base value: ");
        float base = scan.nextFloat();

        System.out.println("Enter height value: ");
        float height = scan.nextFloat();

        float area = base * height;
        System.out.println("The area of the square is " + area);

        float twice = area * 2;
        System.out.println("Twice the area is " + twice);
    }
}
