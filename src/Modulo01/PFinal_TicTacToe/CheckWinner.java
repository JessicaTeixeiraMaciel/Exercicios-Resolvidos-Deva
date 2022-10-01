package Modulo01.PFinal_TicTacToe;

public class CheckWinner {
    public static boolean checkWinner(){
        boolean winner = false;

        if ( (Data.a.equals(Data.b)) && (Data.b.equals(Data.c)) ){
            winner = true;
            WinnerMessage.winnerMessage();
        } else if ( (Data.d.equals(Data.e)) && (Data.e.equals(Data.f)) ) {
            winner = true;
            WinnerMessage.winnerMessage();
        } else if ( (Data.g.equals(Data.h)) && (Data.h.equals(Data.i)) ) {
            winner = true;
            WinnerMessage.winnerMessage();
        } else if ( (Data.a.equals(Data.d)) && (Data.d.equals(Data.g)) ) {
            winner = true;
            WinnerMessage.winnerMessage();
        } else if ( (Data.b.equals(Data.e)) && (Data.e.equals(Data.h)) ) {
            winner = true;
            WinnerMessage.winnerMessage();
        } else if ( (Data.c.equals(Data.f)) && (Data.f.equals(Data.i)) ) {
            winner = true;
            WinnerMessage.winnerMessage();
        } else if ( (Data.a.equals(Data.e)) && (Data.e.equals(Data.i)) ) {
            winner = true;
            WinnerMessage.winnerMessage();
        } else if ( (Data.c.equals(Data.e)) && (Data.e.equals(Data.g)) ) {
            winner = true;
            WinnerMessage.winnerMessage();
        }
        return winner;
    }
}
