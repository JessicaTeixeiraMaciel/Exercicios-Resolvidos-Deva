package Modulo01.P07_CheckLanguage;
import java.util.Scanner;

//O usuário vai informar uma linguagem de programação e o programa deve retornar se a linguagem é interpretada/compilada ou avisar caso não encontre
//Liguagens válidas:
//JAVA - Compilada
//KOTLIN - Compilada
//PHP - Interpretada
//JAVASCRIPT Interpretada

public class CheckLanguage {

    public static void main(String[] args) {
        System.out.println("Informe uma linguagem:");
        Scanner scanner = new Scanner(System.in);
        String inputData = scanner.next().toUpperCase();
        scanner.close();

        Language lg = Language.valueOf(inputData);

        switch (lg) {
            case JAVA:
            case KOTLIN:
                System.out.printf("A linguagem %s é compilada.\n",inputData);
                break;
            case PHP:
            case JAVASCRIPT:
                System.out.printf("A linguagem %s é interpretada.\n",inputData);
                break;
        }
    }

}
