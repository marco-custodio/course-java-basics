package loiane.exercise.matrix;

import java.util.Scanner;

public class ExerciseSix {
    public static String isGameOver(String[][] ticTac){
        int score1 = 0;
        int score2 = 0;

        for (String[] strings : ticTac) {
            for (int j = 0; j < ticTac[0].length; j++) {
                if (strings[j] != null) {
                    if (strings[j].equalsIgnoreCase("X")) {
                        score1++;
                    } else if (strings[j].equalsIgnoreCase("O")) {
                        score2++;
                    }
                }
            }
            if (score1 == 3) {
                return "X";
            } else if (score2 == 3) {
                return "O";
            }
            score1 = 0;
            score2 = 0-;
        }

        for (int i = 0; i < ticTac.length; i++) {
            for (int j = 0; j < ticTac[0].length; j++) {
                if (ticTac[j][i] != null){
                    if (ticTac[j][i].equalsIgnoreCase("X")){
                        score1++;
                    }else if (ticTac[j][i].equalsIgnoreCase("O")){
                        score2++;
                    }
                }
            }
            if (score1 == 3){
                return "X";
            } else if (score2 == 3) {
                return "O";
            }
            score1 = 0;
            score2 = 0;
        }
        for (int i = 0; i < ticTac.length; i++) {
            for (int j = 0; j < ticTac[0].length; j++) {
                if (ticTac[i][j] != null){
                    if (i == j && ticTac[i][j].equalsIgnoreCase("X")){
                        score1++;
                    }else if (i == j && ticTac[i][j].equalsIgnoreCase("O")){
                        score2++;
                    }
                }
            }
            if (score1 == 3){
                return "X";
            } else if (score2 == 3) {
                return "O";
            }
        }
        score1 = 0;
        score2 = 0;
        for (int i = 0; i < ticTac.length; i++) {
            for (int j = 0; j < ticTac[0].length; j++) {
                if (ticTac[i][j] != null){
                    if ((i + j) == (ticTac.length - 1) && ticTac[i][j].equalsIgnoreCase("X")){
                        score1++;
                    }else if ((i + j) == (ticTac.length - 1) && ticTac[i][j].equalsIgnoreCase("O")){
                        score2++;
                    }
                }
            }
            if (score1 == 3){
                return "X";
            } else if (score2 == 3) {
                return "O";
            }
        }
        return "";
    }
    public static void play(String[][] ticTac,int player){
        Scanner scan = new Scanner(System.in);
        System.out.println("Player " + player);
        while (true){
            var n1 = scan.nextInt();
            var n2 = scan.nextInt();
            if (!(n1 < 0 || n1 > 2 && n2 < 0 || n2 > 2)){
                if (player == 1){
                    ticTac [n1][n2] = "X";
                }else {
                    ticTac [n1][n2] = "O";
                }
                break;
            }
            System.out.println("Enter a valid value");
            System.out.println("Player " + player);
        }
    }
    public static void show(String[][] ticTac){
        for (String[] strings : ticTac) {
            for (int j = 0; j < ticTac[0].length; j++) {
                if (strings[j] == null) {
                    System.out.print(" ");
                } else {
                    System.out.printf("%.3s", strings[j]);
                }
                if (j == 0 || j == 1)
                    System.out.print(" | ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {


        String [][] ticTac = new String[3][3];

        System.out.println("Welcome!");
        System.out.println("Player 1 starts");

        while (true){
            play(ticTac,1);
            if (isGameOver(ticTac).equalsIgnoreCase("X")){
                System.out.println("Player 1 won!");
                show(ticTac);
                break;
            }else if (isGameOver(ticTac).equalsIgnoreCase("O")){
                System.out.println("Player 2 won!");
                show(ticTac);
                break;
            }
            play(ticTac,2);
            if (isGameOver(ticTac).equalsIgnoreCase("X")){
                System.out.println("Player 1 won!");
                show(ticTac);
                break;
            }else if (isGameOver(ticTac).equalsIgnoreCase("O")){
                System.out.println("Player 2 won!");
                show(ticTac);
                break;
            }
            show(ticTac);
        }
    }
}
