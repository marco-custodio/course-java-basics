package loiane.exercise.loop;

import java.util.Scanner;

public class ExerciseOne {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Rate our store with a score between 0 and 10");

        float score = scan.nextFloat();

        while (score > 10.00){
            System.out.println("Invalid rating,please enter a value between 0 and 10");
            score = scan.nextFloat();
        }
    }
}
