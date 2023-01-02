package loiane.exercise.ifelseswitch;

import java.util.Scanner;

public class ExerciseOne {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number");
        int numOne = scan.nextInt();

        System.out.println("Enter another number");
        int numTwo = scan.nextInt();

        if (numOne > numTwo){
            System.out.printf("the number %d is greater", numOne);
        } else{
            System.out.printf("the number %d is greater", numTwo);
        }

    }
}