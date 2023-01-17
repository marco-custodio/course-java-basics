package loiane.exercise.arrays;

import java.util.Arrays;

public class ExerciseTwo {
    public static void main(String[] args) {
        int[] a = new int[8];
        a[0] = 2;
        a[1] = 9;
        a[2] = 6;
        a[3] = 4;
        a[4] = 5;
        a[5] = 6;
        a[6] = 7;
        a[7] = 1;

        int [] b = new int[9];

        for (int i = 0; i < a.length;i++){
            b[i] = a[i]*2;
        }

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }
}
