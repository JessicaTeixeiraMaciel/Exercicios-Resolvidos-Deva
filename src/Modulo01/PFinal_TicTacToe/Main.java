
package Modulo01.PFinal_TicTacToe;
import static Modulo01.PFinal_TicTacToe.Names.names;

public class Main {
    public static void main(String[] args) {

        Title.title();
        Instructions.instructions();
        Exit.exit();
        Data.player1 = names("primeiro");
        Data.player2 = names("segundo");
        System.out.printf("\nOk! %s jogará com o 'X' e %s jogará com o 'O'.\n\n",Data.player1,Data.player2);
        Round.round();
        Play.play();
    }
}
