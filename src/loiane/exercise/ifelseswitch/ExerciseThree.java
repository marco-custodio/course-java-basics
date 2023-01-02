package loiane.exercise.ifelseswitch;

import java.util.Scanner;

public class ExerciseThree {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Type the initial of your gender: ");
        var gender = scan.next();

        if (gender.equalsIgnoreCase("m")){
            System.out.println("Male");
        }else if (gender.equalsIgnoreCase("f")){
            System.out.println("Female");
        }else {
            System.out.println("Undefined");
        }
    }
}
