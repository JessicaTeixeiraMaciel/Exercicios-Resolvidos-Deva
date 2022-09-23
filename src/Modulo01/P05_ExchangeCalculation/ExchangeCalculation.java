package Modulo01.P05_ExchangeCalculation;

public class ExchangeCalculation {

    public static void main(String[] args) {
        double dailyQuote = 5.26d;
        double amount = 3500d;

        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------\n" +
                "                                                BEM VINDO(A) A CALCULADORA DE CÂMBIO!\n" +
                "-------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Olá! Neste programa vamos converter REAIS em DÓLARES conforme a cotação do dia.\n");
        System.out.printf("O usuário forneceu as seguintes informações:\n" +
                "- Cotação diária do dólar: R$ %.2f\n" +
                "- Montante em reais: R$ %.2f\n",dailyQuote,amount);
        System.out.println("\n************************************************************* RESULTADO *************************************************************");
        System.out.printf("%.2f reais equivalem a %.2f dólares.\n",amount,amount/dailyQuote);
        System.out.println("\n-------------------------------------------------------------------------------------------------------------------------------------" +
                "\n                                            OBRIGADA POR USAR A CALCULADORA DE CÂMBIO! :)\n" +
                "-------------------------------------------------------------------------------------------------------------------------------------");
    }

}

