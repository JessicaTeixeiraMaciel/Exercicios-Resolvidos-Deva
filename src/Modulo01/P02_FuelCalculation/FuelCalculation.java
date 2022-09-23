package Modulo01.P02_FuelCalculation;

public class FuelCalculation {

    public static void main(String[] args) {
        String departurePlace = "SALVADOR";
        String arrivalPlace = "SÃO PAULO";
        double travelHours = 27;
        double averageSpeed = 72.59;

        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------\n" +
                "                                                BEM VINDO(A) A CALCULADORA DE COMBUSTÍVEL!\n" +
                "-------------------------------------------------------------------------------------------------------------------------------------");
        System.out.printf("Olá! Neste programa vamos calcular a quantidade de litros de combustível gastos em uma viagem partindo de %s até %s.\n",departurePlace,arrivalPlace);
        System.out.println("Obs.: O automóvel que fez a viagem tem o consumo médio de 12km por litro de combustível.\n");
        System.out.printf("O motorista forneceu as seguintes informações:\n" +
                "- Horas gastas na viagem: %.2fh\n" +
                "- Velocidade média: %.2fkm/h\n",travelHours,averageSpeed);
        System.out.println("\n************************************************************* RESULTADO *************************************************************");
        System.out.printf("Conforme as informações fornecidas podemos chegar aos seguintes resultados:\n" +
                "- Distância total da viagem: %.2fkm\n" +
                "- Litros de combústivel gastos: %.2fl\n",travelHours * averageSpeed,(travelHours * averageSpeed)/12);
        System.out.println("\n-------------------------------------------------------------------------------------------------------------------------------------" +
                "\n                                         OBRIGADA POR USAR A CALCULADORA DE COMBUSTÍVEL! :)\n" +
                "-------------------------------------------------------------------------------------------------------------------------------------");
    }

}
