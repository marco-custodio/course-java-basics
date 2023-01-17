package loiane.exercise.arrays;

import java.util.Arrays;

public class ExerciseOne {
    public static void main(String[] args) {

        int[] a = new int[5];
        a [0] = 2;
        a [1] = 9;
        a [2] = 6;
        a [3] = 4;
        a [4] = 5;

        int [] b;
        b = a;

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }
}
