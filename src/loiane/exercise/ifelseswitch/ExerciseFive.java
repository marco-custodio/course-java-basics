package loiane.exercise.ifelseswitch;

import java.util.Scanner;

public class ExerciseFive {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first semester partial school grades:");
        var first = scan.nextFloat();

        System.out.println("Enter second semester partial school grades");
        var second = scan.nextFloat();

        float media = (first + second)/2;
        System.out.println("The student grade was " + media);

        if (media >= 7 && media < 10){
            System.out.println("Approved student");
        } else if (media < 7){
            System.out.println("Failed student");
        }else if (media == 10){
            System.out.println("Student approved with maximum grade");
        }
    }
}
