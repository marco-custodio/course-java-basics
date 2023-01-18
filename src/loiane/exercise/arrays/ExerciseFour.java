package loiane.exercise.arrays;

import java.util.Arrays;

public class ExerciseFour {
    public static void main(String[] args) {

        int [] a = { 52, 19 ,47, 35, 6, 15, 70, 16 ,34, 22, 5, 12, 49, 26 ,53};

        int [] b = new int[a.length];

        for (int i = 0; i < a.length; i++){
            b[i]= (int) Math.sqrt(a[i]);
        }
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }
}
