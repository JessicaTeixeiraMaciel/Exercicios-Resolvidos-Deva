//Projeto Jogo da Velha:
//        - O jogo deverá ter dois jogadores e pedir para informar os nomes deles.
//        - Ao final do jogo deverá ser informado o nome do jogador que ganhou ou se deu empate.
//        - Se for empate não soma pontos para o jogador.
//        - Exibir um placar ao final de cada partida entre os mesmos jogadores.
//        -- Exemplo: (jogador1) 2 x 0 (jogador2)
//        - Perguntar se os mesmos jogadores querem jogar novamente.
//        -- Se for empate mensagem genérica "Jogar novamente? "
//        -- Se houver um vencedor mensagem "jogadorX ganhou";

package Modulo01.PFinal_TicTacToe;

public class TicTacToe {
    public static void main(String[] args) {

        Welcome.wellcome();
        Instructions.instructions();
        Start.start();
        InsertNames.insertNames();

    }
}
