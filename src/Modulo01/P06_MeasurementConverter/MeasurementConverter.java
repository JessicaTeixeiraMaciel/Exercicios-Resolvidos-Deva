package Modulo01.P06_MeasurementConverter;

public class MeasurementConverter {

    public static void main(String[] args) {
        double polegadas = 3.5d;
        double centimetros = polegadas * 2.54;
        ;

        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------\n" +
                "                                                BEM VINDO(A) A0 CONVERSOR DE MEDIDAS!\n" +
                "-------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Olá! Neste programa vamos converter POLEGADAS em CENTÍMETROS.\n");
        System.out.printf("O usuário forneceu a seguinte medida: %.2f polegadas.\n",polegadas);
        System.out.println("\n************************************************************* RESULTADO *************************************************************");
        System.out.printf("%.2f polegadas equivalem a %.2f centímetros.\n",polegadas,centimetros);
        System.out.println("\n-------------------------------------------------------------------------------------------------------------------------------------" +
                "\n                                            OBRIGADA POR USAR O CONVERSOR DE MEDIDAS! :)\n" +
                "-------------------------------------------------------------------------------------------------------------------------------------");
    }

}
