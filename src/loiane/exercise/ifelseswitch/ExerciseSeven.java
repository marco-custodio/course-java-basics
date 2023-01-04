package loiane.exercise.ifelseswitch;

import java.util.Scanner;

public class ExerciseSeven {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the first number: ");

        var one = scan.nextInt();
        System.out.println("Enter the second number: ");

        var two = scan.nextInt();
        System.out.println("Enter the third number: ");

        var three = scan.nextInt();

        if (one > two && one > three ){
            System.out.println("The largest number entered is: " + one);
        } else if (two > one && two > three) {
            System.out.println("The largest number entered is: " + two);
        }else {
            System.out.println("The largest number entered is: " + three);
        }
        if (one < two && one < three ){
            System.out.println("The smallest number entered is: " + one);
        } else if (two < one && two < three) {
            System.out.println("The smallest number entered is: " + two);
        }else if (three < one && three < two)  {
            System.out.println("The smallest number entered is: " + three);
        }
    }
}
