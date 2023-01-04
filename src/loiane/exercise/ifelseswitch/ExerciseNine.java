package loiane.exercise.ifelseswitch;

import java.util.Scanner;

public class ExerciseNine {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("digite um numero:");
        var first = scan.nextInt();

        System.out.println("digite outro numero:");
        var second = scan.nextInt();

        System.out.println("digite outro numero:");
        var third = scan.nextInt();

        if (first > second && first > third){
            if (second>third){
                System.out.println(first + " " + second + " " + third);
            } else {
                System.out.println(first + " " + third + " " + second);
            }
        } else if (second>first && second > third){
            if (first>third){
                System.out.println(second + " " + first + " " + third);
            } else {
                System.out.println(first + " " + third+ " " + second);
            }
        }else {
            if (second>third){
                System.out.println(third + " " + first + " " + second);
            } else {
                System.out.println(third + " " + second + " " + first);
            }
        }

    }
}
