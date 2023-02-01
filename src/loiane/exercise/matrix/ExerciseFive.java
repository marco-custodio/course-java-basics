package loiane.exercise.matrix;

import java.util.Scanner;

public class ExerciseFive {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String[][][] matrix = new String [12][31][8];

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
                System.out.println("Enter the month");
                var month = scan.nextInt();

                System.out.println("Enter the day:" );
                var day = scan.nextInt();

                System.out.println("Enter the time: ");
                var hour  = scan.nextInt();

                if (!schedule(month,day,hour)){
                    System.out.println("Please enter a valid option");
                    continue;
                }
                System.out.println("Enter the commitment: ");
                matrix[month-1][day-1][hour] = scan.next();
            } else if (opt == 2){
                for (String[][] month : matrix) {
                    for (String[] days : month) {
                        for (String hour : days) {
                            if (hour == null) {
                                System.out.printf("%-10s", "Empty");
                                continue;
                            }
                            System.out.printf("%-10s", hour);

                        }
                        System.out.println(" ");
                    }
                }
            }else {
                System.out.println("Please enter a valid option");
            }
        }
    }

    public static boolean schedule(int month, int day, int hour){
        return (month > 0 && month < 13) && (day > 0 && day < 32) && (hour >= 0 && hour < 9);
    }
}