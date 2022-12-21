package loiane.exercise;

import java.util.Scanner;

public class ExerciseEight {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("How much do you earn per hour worked?");
        float money = scan.nextFloat();

        System.out.println("How many hours did you work this month?");
        float hours = scan.nextFloat();

        float salary = money * hours;
        System.out.printf("The salary of the month is %.2f", salary);

    }
}
