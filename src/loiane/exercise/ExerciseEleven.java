package loiane.exercise;

import java.util.Scanner;

public class ExerciseEleven {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Type an integer number: ");
        var numOne = scan.nextInt();

        System.out.println("Type another integer number: ");
        var numTwo = scan.nextInt();

        System.out.println("Type a decimal number: ");
        var numThree = scan.nextFloat();

        var a = (numOne*2) + (numTwo/2);
        var b = numOne*3;

        System.out.printf("Multiplying double of %d with half of %d is %d \n",numOne, numTwo, a );
        System.out.printf("The sum of the triple of %d and %.2f is %.2f\n",numOne,numThree, b + numThree);
        System.out.printf("%.2f cubed is %.2f", numThree, Math.pow(numThree, 3));
    }
}
