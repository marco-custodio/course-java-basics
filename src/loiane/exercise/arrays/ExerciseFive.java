package loiane.exercise.arrays;

import java.util.Arrays;

public class ExerciseFive {
    public static void main(String[] args) {

        int [] a = { 8, 6, 7, 4, 9 ,4 ,5 ,1, 5, 3};
        int [] b = new int[a.length];

        for (int i = 0; i<10; i++){
            b[i] = a[i] * i;
        }
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));

    }
}
