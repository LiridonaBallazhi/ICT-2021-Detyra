package ORA3.hyrje.ne.java;

import java.util.Scanner;

public class KosovaÇekia {

    public static void main(String[] args) {

        Scanner reader = new Scanner (System.in);

        System.out.printf("Ekipi vendas: ");
        String ekipiVendas=reader.nextLine();

        System.out.printf("Ekipi musafir: ");
        String ekipiMusafir=reader.nextLine();

        System.out.printf("Golat e ekipit vendas: ");
        int gVendas=reader.nextInt();

        System.out.printf("Golat e ekipit musafir: ");
        int gMusafir=reader.nextInt();

        System.out.println("Rezultati: " + ekipiVendas + "-" + ekipiMusafir + "  " + gVendas + ":" + gMusafir);

    }
}
