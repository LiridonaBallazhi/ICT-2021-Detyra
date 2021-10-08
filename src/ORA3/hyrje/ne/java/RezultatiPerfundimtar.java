package ORA3.hyrje.ne.java;

import java.util.Scanner;

public class RezultatiPerfundimtar {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.printf("Ekipi Vendas: ");
        String eVendas=reader.nextLine();

        System.out.printf("Ekipi Musafir: ");
        String eMusafir=reader.nextLine();

        System.out.printf("Arena: ");
        String arena=reader.nextLine();

        System.out.printf("Numri i tifozëve: ");
        int tifozet=reader.nextInt();

        System.out.printf("Sa gola ka shënuar " + eVendas + ": ");
        int gVendas=reader.nextInt();

        System.out.printf("Sa gola ka shënuar " + eMusafir + ": ");
        int gMusafir=reader.nextInt();

        System.out.println("------------------------------------");
        System.out.println("Rezultati përfundimtar");
        System.out.println(eVendas + "-" + eMusafir + " " + gVendas + ":" + gMusafir);
        System.out.println(arena + " me gjithsej " + tifozet + " spektatorë prezent.");

    }

}
