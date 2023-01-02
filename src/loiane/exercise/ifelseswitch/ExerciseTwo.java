package loiane.exercise.ifelseswitch;

import java.util.Scanner;

public class ExerciseTwo {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number");
        int num = scan.nextInt();

        if (num >= 0){
            System.out.printf("%d is a positive number", num);
        } else{
            System.out.printf("%d is a negative number", num);
        }

    }
}