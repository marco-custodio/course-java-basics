package loiane.exercise.loop;

import java.util.Scanner;

public class ExerciseThree {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = "";
        do {
            System.out.println("Type your name: ");
            name = scan.next();
        }while (name.length() < 3);

        var age = scan.nextInt();
        while (age >= 0 && age < 150) {
            System.out.println("Enter your age: ");
            age = scan.nextInt();
        }

//
//        System.out.println("Enter your salary: ");
//        var salary = scan.nextFloat();
//
//        System.out.println("What's your gender? ");
//        var gender = scan.next();
//
//        System.out.println("What is your marital status:");
//        var marital = scan.next().charAt(0);


    }
}
