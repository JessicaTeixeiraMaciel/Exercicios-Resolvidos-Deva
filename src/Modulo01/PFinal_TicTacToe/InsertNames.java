package Modulo01.PFinal_TicTacToe;
import java.util.Scanner;


public class InsertNames {

    public static void insertNames(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o nome do primeiro jogador:");
        String player1 = sc.next().toUpperCase();
        System.out.println("Insira o nome do segundo jogador:");
        String player2 = sc.next().toUpperCase();
        System.out.printf("Ok! %s jogará com o 'X' e %s jogará com o 'O'.",player1,player2);
    }
}
