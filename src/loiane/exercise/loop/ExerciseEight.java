package loiane.exercise.loop;

import java.util.Scanner;

public class ExerciseEight {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int sum = 0;

        for (int i = 0; i < 5; i++){
            sum += scan.nextInt();
        }
        System.out.println("The sum of the numbers is " + sum);
        System.out.println("The average of the sum is "+ sum /5);
    }
}
