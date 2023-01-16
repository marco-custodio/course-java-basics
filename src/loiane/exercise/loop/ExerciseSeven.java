package loiane.exercise.loop;

import java.util.Scanner;

public class ExerciseSeven {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int maxNum = 0;

        System.out.println("Enter five different numbers");

        for (int i = 0; i < 5; i++){
            var num = scan.nextInt();

            if (num>maxNum){
                maxNum = num;
            }
        }

        System.out.println("The largest number entered was " + maxNum);
    }
}
