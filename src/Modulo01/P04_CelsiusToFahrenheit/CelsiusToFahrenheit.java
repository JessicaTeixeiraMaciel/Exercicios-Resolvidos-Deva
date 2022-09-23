package Modulo01.P04_CelsiusToFahrenheit;

public class CelsiusToFahrenheit {

    public static void main(String[] args) {
        double celsius = 25d;
        double fahrenheit = 1.8 * celsius + 32d;

        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------\n" +
                "                                             BEM VINDO(A) AO CONVERSOR DE TEMPERATURAS!\n" +
                "-------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Olá! Neste programa vamos converter graus CELSIUS em FAHRENHEIT.\n");
        System.out.printf("O usuário informou a seguinte temperatura: %.2fºC.\n",celsius);

        System.out.println("\n************************************************************* RESULTADO *************************************************************");
        System.out.printf("%.2f graus celsius equivalem a %.2f graus fahrenheit.\n",celsius,fahrenheit);
        System.out.println("\n-------------------------------------------------------------------------------------------------------------------------------------" +
                "\n                                         OBRIGADA POR USAR O CONVERSOR DE TEMPERATURAS! :)\n" +
                "-------------------------------------------------------------------------------------------------------------------------------------");
    }

}
