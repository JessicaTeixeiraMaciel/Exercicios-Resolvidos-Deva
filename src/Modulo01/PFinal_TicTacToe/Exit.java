package Modulo01.PFinal_TicTacToe;
import java.util.Scanner;

public class Exit {

    public static void exit() {


        Scanner sc = new Scanner(System.in);
        System.out.println("Insira qualquer digito para continuar ou insira 's' para sair:");
        String choose = sc.next().toLowerCase();
        if (choose.equals("s")) {
            System.out.print("Mas já? Tudo bem, espero nos vermos em breve... Até mais! ;)");
            System.exit(0);
        }
    }
}
