package Modulo01.PFinal_TicTacToe;
import java.util.Scanner;

public class Start {

    public static void start() {


        Scanner sc = new Scanner(System.in);
        System.out.println("Insira qualquer digito para continuar ou insira 's' para sair:");
        String choose = sc.next();
        if (choose.equals("s")) {
            System.out.print("Mas já? Tudo bem, espero nos vermos em breve... Até mais! ;)");
            System.exit(0);
        } else {
//            ClearScreen.clearScreen();
            System.out.println("LEGAL! VAMOS CONTINUAR!\n");
        }
    }
}
