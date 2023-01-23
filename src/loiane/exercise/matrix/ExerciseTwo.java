package loiane.exercise.matrix;

import java.util.Random;

public class ExerciseTwo {
    public static void main(String[] args) {

        var rand = new Random();
        int[][] matrix = new int[10][10];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = rand.nextInt(100);
                System.out.printf(" %02d ",matrix[i][j]);
            }
            System.out.println("");
        }
        var minAux = matrix[5][0];
        var maxAux = matrix[5][0];

        for (int c = 0; c < matrix[5].length; c++) {
            if (matrix[5][c]<minAux){
                minAux = matrix[5][c];
            } else if (matrix[5][c]>maxAux) {
                maxAux = matrix[5][c];
            }
        }
        System.out.println(" ");
        System.out.println("Largest and smallest number in the row 5");
        System.out.println("Smaller: " + minAux + " Larger: " + maxAux);
        System.out.println(" ");

        var miniAux = matrix[0][7];
        var maxiAux = matrix[0][7];
        System.out.println(" ");

        for (int l = 0; l < matrix[7].length; l++) {
            if (matrix[l][7] < miniAux) {
                miniAux = matrix[l][7];
            } else if (matrix[l][7] > maxiAux) {
                maxiAux = matrix[l][7];
            }
        }
        System.out.println("Largest and smallest number in the column 5");
        System.out.println("Smaller: " + miniAux + " Larger: " + maxiAux);
    }
}
