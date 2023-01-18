package loiane.exercise.arrays;

import java.util.Arrays;

public class ExerciseTen {
    public static void main(String[] args) {


        int [] a = { 4, 3, 8, 5, 9, 4, 6, 2, 6, 1};
        int [] b = new int[a.length];

        for (int i = 0; i < 10; i++){
            b[i] = a[i] % 2;
        }
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }
}
