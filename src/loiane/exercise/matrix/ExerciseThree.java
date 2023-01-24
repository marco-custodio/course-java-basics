package loiane.exercise.matrix;

import java.util.Scanner;

public class ExerciseThree {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[][] m = new int[3][3];

        for (int i = 0; i < m.length; i++){
           for (int j = 0; j < m[i].length; j++){
               System.out.println("Enter 9 different numbers");
               m[i][j] = scan.nextInt();
           }
        }

        for (int i = 0; i < m.length; i++){
            for (int j = 0; j < m[i].length; j++){
                System.out.printf("%02d ",m[i][j]);
            }
            System.out.println("");
        }
        var countEven = 0;
        var countOdd = 0;
        for (int i = 0; i < m.length; i++){
            for (int j = 0; j < m[i].length; j++){
                if (m[i][j] % 2 == 0){
                    countEven++;
                }else {
                    countOdd++;
                }
            }
        }
        System.out.println("Even: " + countEven);
        System.out.println("Odd: " + countOdd);
    }
}
