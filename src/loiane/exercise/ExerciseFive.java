package loiane.exercise;

import java.util.Scanner;

public class ExerciseFive {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Meters to centimeters converter");

        System.out.println("Enter size in meters:");
        float meters = scan.nextFloat();
        float cent = meters /100;

        System.out.println("The size in centimeters is " + cent);
    }
}
