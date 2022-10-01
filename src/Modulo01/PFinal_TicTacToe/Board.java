package Modulo01.PFinal_TicTacToe;

public class Board {
    public static void board(){
        String a = Data.a;
        String b = Data.b;
        String c = Data.c;
        String d = Data.d;
        String e = Data.e;
        String f = Data.f;
        String g = Data.g;
        String h = Data.h;
        String i = Data.i;

        String [][] matriz = {{a,b,c},{d,e,f},{g,h,i}};

        System.out.printf("\n|-----|-----|-----|\n" +
                "| %s | %s | %s |\n" +
                "|-----|-----|-----|\n" +
                "| %s | %s | %s |\n" +
                "|-----|-----|-----|\n" +
                "| %s | %s | %s |\n" +
                "|-----|-----|-----|\n",a,b,c,d,e,f,g,h,i);

    }
}

