package loiane.exercise.loop;

import java.util.Scanner;

public class ExerciseFive {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter population A");
        int popA = scan.nextInt();

        System.out.println("Enter annual population growth A");
        float growthA = scan.nextFloat();

        System.out.println("Enter population B");
        int popB = scan.nextInt();

        System.out.println("Enter annual population growth B");
        float growthB = scan.nextFloat();
        int year = 0;

        do {
            year++;
            popA += popA * (growthA /100);
            popB += popB * (growthB /100);
            System.out.println( "Year: " + year + " Population A: " + popA + " Population B: " + popB);
        }while (popA<popB);

    }
}
