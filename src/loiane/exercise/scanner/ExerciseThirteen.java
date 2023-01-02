package loiane.exercise.scanner;

import java.util.Scanner;

public class ExerciseThirteen{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Type your gender:");
        var gender = scan.next();
        System.out.println("Type your height:");
        var height = scan.nextDouble();

        double ideal;
        if (gender.equalsIgnoreCase("m")){
             ideal = (72.7 * height) - 58;
        }else {
             ideal = (62.1 * height) - 44.7;
        }

        System.out.printf("Your ideal weight is %.2f\n", ideal);

        System.out.println("Type your current weight");
        var currentWeight = scan.nextDouble();

        if (currentWeight > ideal){
            System.out.println("Overweight");
        } else if (currentWeight < ideal) {
            System.out.println("Under weight");
        } else {
            System.out.println("Ideal weight");
        }
    }
}
