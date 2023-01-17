package loiane.exercise.arrays;

import java.util.Arrays;

public class ExerciseThree {
    public static void main(String[] args) {

        int [] a = { 8, 9 ,7, 5, 6, 5, 7, 6 ,4, 2, 5, 2, 9, 6 ,3};

        int b [] = new int[a.length];

        for (int i = 0; i < a.length; i++){
            b[i]=a[i]*a[i];
        }
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }
}
