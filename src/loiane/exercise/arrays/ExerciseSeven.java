package loiane.exercise.arrays;

import java.util.Arrays;

public class ExerciseSeven {
    public static void main(String[] args) {
        int [] a = { 8, 6, 7, 9, 4, 9, 5, 1, 5, 3};
        int [] b = { 4, 3, 8, 5, 9, 4, 6, 2, 6, 1};
        int [] c = new int[a.length];

        for (int i = 0; i < 10; i++){
            c[i] = a[i]-b[i];
        }
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.toString(c));
    }
}
