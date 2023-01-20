package loiane.exercise.matrix;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ExerciseOne {
    public static void main(String[] args) {

        var list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16));
        Collections.shuffle(list);

        int[][] m = new int[4][4];

        for (int i = 0; i < m.length; i++)  {
            for (int j = 0; j < m[i].length; j++){
                m[i][j] = list.get(i+j);
            }
        }
        for (int i = 0; i < m.length; i++)  {
            for (int j = 0; j < m[i].length; j++){
                System.out.print(m[i][j]+" ");
            }
            System.out.println(" ");
        }
        var aux = 0;
        var row = 0;
        var col = 0;

        for (int i = 0; i < m.length; i++)  {
            for (int j = 0; j < m[i].length; j++){
                if (m[i][j]>aux){
                    aux = m [i][j];
                    row = i+1;
                    col = j+1;
                }
            }
        }
        System.out.printf("The largest number is %d. It is on row %d, column %d.",aux,row,col);
    }
}
