package ORA3.hyrje.ne.java;

import java.util.Scanner;

public class Barcelona {

    public static void main(String[] args) {
        Scanner ekipi=new Scanner (System.in);

        System.out.printf("Zgjedhni ekipin tuaj te zemrës: ");
        String ekipiSportiv=ekipi.nextLine();

        System.out.printf( ekipiSportiv + " është ekipi juaj i zemrës.");

    }
}
