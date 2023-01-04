package loiane.exercise.ifelseswitch;

import java.util.Scanner;

public class ExerciseEight {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Price comparison");

        System.out.println("Enter the price of the first product:");
        var firstPro = scan.nextFloat();

        System.out.println("Enter the price of the second product:");
        var secondPro = scan.nextFloat();

        System.out.println("Enter the price of the third product:");
        var thirdPro = scan.nextFloat();

        if (firstPro < secondPro && firstPro < thirdPro ){
            System.out.printf(" %.2f is the best value of this product! ", firstPro);
        } else if (secondPro < firstPro && secondPro < thirdPro) {
            System.out.printf(" %.2f is the best value of this product! ", secondPro);
        }else if (thirdPro < firstPro && thirdPro < secondPro)  {
            System.out.printf(" %.2f is the best value of this product! ", thirdPro);
        }

    }
}
