package Modulo01.P03_MultiplicationTable;

public class MultiplicationTable {

    public static void main(String[] args) {
        int n = 7;
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------\n" +
                "                                                 BEM VINDO(A) A TABUADA DE MULTIPLICAÇÃO!\n" +
                "-------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Olá! Neste programa vamos informar a tábuada de multiplicação de um número inteiro entre 1 e 10.\n");
        System.out.printf("O usuário informou o seguinte número: %d.\n",n);

        System.out.println("\n************************************************************* RESULTADO *************************************************************");
        System.out.printf(n + " x 0 = %d\n",n * 0);
        System.out.printf(n + " x 1 = %d\n",n * 1);
        System.out.printf(n + " x 2 = %d\n",n * 2);
        System.out.printf(n + " x 3 = %d\n",n * 3);
        System.out.printf(n + " x 4 = %d\n",n * 4);
        System.out.printf(n + " x 5 = %d\n",n * 5);
        System.out.printf(n + " x 6 = %d\n",n * 6);
        System.out.printf(n + " x 7 = %d\n",n * 7);
        System.out.printf(n + " x 8 = %d\n",n * 8);
        System.out.printf(n + " x 9 = %d\n",n * 9);
        System.out.printf(n + " x 10 = %d\n",n * 10);
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------" +
                "\n                                           OBRIGADA POR USAR A TABUADA DE MULTIPLICAÇÃO! :)\n" +
                "-------------------------------------------------------------------------------------------------------------------------------------");
    }

}
