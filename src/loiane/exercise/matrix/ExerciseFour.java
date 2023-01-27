package loiane.exercise.matrix;

import java.util.Scanner;

public class ExerciseFour {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String[][] matrix = new String [24][30];

        while (true){
            var opt = 0;
            System.out.println("Schedule: ");
            System.out.println("1 - Create schedule");
            System.out.println("2 - Check schedule");
            System.out.println("3 - Exit");
            opt = scan.nextInt();

            if (opt == 3){
                break;
            } else if (opt == 1){
                System.out.println("Enter the day:" );
                var day = scan.nextInt();
                System.out.println("Enter the time: ");
                var hour  = scan.nextInt();
                System.out.println("Enter the commitment: ");
                matrix[hour][day-1] = scan.next();
            } else if (opt == 2){
                for (String[] days : matrix) {
                    for (String hour : days) {
                        if (hour == null) {
                            System.out.printf("%-10s", "Empty");
                            continue;
                        }
                        System.out.printf("%-10s", hour);

                    }
                    System.out.println(" ");
                }
            }else {
                System.out.println("Please enter a valid option");
            }
        }
    }
}