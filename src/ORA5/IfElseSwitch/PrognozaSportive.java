package ORA5.IfElseSwitch;

import java.util.Scanner;
public class PrognozaSportive {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.println("Opsionet e prognozës janë: ");
        System.out.println("1-Fitore e ekipit vendas.");
        System.out.println("X-Barazim.");
        System.out.println("2-Fitore e ekipit nusafir.");
        System.out.println("-----------------------------------------------------------------------------------------------");
        System.out.println("                                                                                               ");

        System.out.printf("Shkruaj ekipin vendas: ");
        String eVendas = reader.nextLine();

        System.out.printf("Shkruaj ekipin musafir: ");
        String eMusafir = reader.nextLine();

        System.out.println("                                                                                               ");

        if (!eVendas.equals("REAL MADRID"))
        {
            if (!eMusafir.equals("REAL MADRID"))

            System.out.printf("Prognoza ime për ndeshjen ndërmjet %s vs %S është se mbesin barazim.", eVendas, eMusafir);
        }

            switch (eVendas) {
                    case "REAL MADRID": {

                        System.out.printf("-Prognoza ime për ndeshjen ndërmjet %s vs %S është se fiton %s %n", eVendas, eMusafir, eVendas);
                        break;
                    }

                }

                switch (eMusafir) {
                    case "REAL MADRID": {

                        System.out.printf("Prognoza ime për ndeshjen ndërmjet %s vs %S është se fiton %s %n", eVendas, eMusafir, eMusafir);
                        break;
                    }

                }
        }
    }

