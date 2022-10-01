package Modulo01.PFinal_TicTacToe;
import java.util.Scanner;


public class Names {

    public static String names(String numberPlayer){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Insira o nome do %s jogador:\n",numberPlayer);
        return sc.next().toUpperCase();
    }
}
