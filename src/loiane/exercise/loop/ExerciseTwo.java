package loiane.exercise.loop;

import java.util.Scanner;

public class ExerciseTwo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Login");

        System.out.println("Username");
        String user = scan.next();

        System.out.println("Password");
        String pass = scan.next();

        while (user.equalsIgnoreCase(pass)){
            System.out.println("Invalid password,please enter a different password.");
            pass = scan.next();
        }
    }
}
