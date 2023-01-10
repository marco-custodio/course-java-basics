package loiane.exercise.loop;

public class ExerciseFour {

    private static final float GROWTH_RATE_A = 3.0f;
    private static final float GROWTH_RATE_B = 1.5f;

    public static void main(String[] args) {

        int popA = 80_000;
        int popB = 200_000;
        int year = 0;
        do {
            year++;
            popA += popA * (GROWTH_RATE_A/100);
            popB += popB * (GROWTH_RATE_B /100);
            System.out.println( "Year: " + year + " Population A: " + popA + " Population B: " + popB);
        }while (popA<popB);

    }
}
