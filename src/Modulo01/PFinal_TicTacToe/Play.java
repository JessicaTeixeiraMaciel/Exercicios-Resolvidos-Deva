package Modulo01.PFinal_TicTacToe;
import java.util.Scanner;

public class Play {

    public static void play() {
        Data.player = Data.player1;
        String simbol = " X ";
        Scanner sc = new Scanner(System.in);

        Data.a = "(1)";
        Data.b = "(2)";
        Data.c = "(3)";
        Data.d = "(4)";
        Data.e = "(5)";
        Data.f = "(6)";
        Data.g = "(7)";
        Data.h = "(8)";
        Data.i = "(9)";

        int i = 1;

        while ((!CheckWinner.checkWinner()) && i<=9) {

            System.out.printf("\n%s, é a vez do%sjogar! Escolha uma posição livre:",Data.player,simbol);

            Board.board();

            System.out.println("Informe sua jogada:");

            while (!sc.hasNextInt()) {
                sc.next();
                System.out.println("Entrada inválida. Informe novamente sua jogada:");
            }

           int choose = sc.nextInt();

            if (choose == 1){
                Data.a = simbol;
            } else if (choose == 2) {
                Data.b = simbol;
            }else if (choose == 3) {
                Data.c = simbol;
            }else if (choose == 4) {
                Data.d = simbol;
            }else if (choose == 5) {
                Data.e = simbol;
            }else if (choose == 6) {
                Data.f = simbol;
            }else if (choose == 7) {
                Data.g = simbol;
            }else if (choose == 8) {
                Data.h = simbol;
            }else if (choose == 9) {
                Data.i = simbol;
            }

            if (Data.player.equals(Data.player1)) {
                Data.player = Data.player2;
            } else {
                Data.player = Data.player1;
            }

            if (Data.player.equals(Data.player1)) {
                simbol = " X ";
            } else {
                simbol = " O ";
            }
            i++;
        }

       if (i == 10) {
           TieMessage.tieMessage();
       }
    }
}
