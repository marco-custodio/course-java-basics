package loiane.exercise.loop;

import java.util.Scanner;

public class ExerciseOne {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Avalie nossa loja com uma nota entre 0 e 10");

        float nota = scan.nextFloat();

        while (nota > 10.00){
            System.out.println("Nota inválida, digite um valor entre 0 e 10");
            nota = scan.nextFloat();
        }
    }
}
