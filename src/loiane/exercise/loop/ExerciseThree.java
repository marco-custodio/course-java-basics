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

        System.out.println("Enter your age: ");
        var age = scan.nextInt();
        while (age < 0 || age > 150){
            System.out.println("Enter your age: ");
            age = scan.nextInt();
        }

        System.out.println("Enter your salary: ");
        var salary = scan.nextFloat();
        while (salary <= 0){
            System.out.println("Enter your salary: ");
            salary = scan.nextFloat();
        }

        char gender;
        do {
            System.out.println("What's your gender? ");
            gender = scan.next().charAt(0);
        }while (gender != 'f'&& gender !='m');

        char marital;
        do {
            System.out.println("What is your marital status:");
            marital = scan.next().charAt(0);
        }while (marital != 's' && marital != 'm' && marital != 'w' && marital != 'd');


    }
}
