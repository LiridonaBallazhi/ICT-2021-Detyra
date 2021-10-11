package ORA5.IfElseSwitch;

import java.util.Scanner;

public class Figura {
    public static void main(String[] args) {

        Scanner figura = new Scanner(System.in);
        System.out.println("Figurat në dispozicion janë: ");
        String a = "1-Trekëndësh";
        System.out.println(a);
        String b = "2-Drejtkëndësh";
        System.out.println(b);
        String c = "3-Katror";
        System.out.println(c);
        System.out.println("                                         ");
        System.out.printf("Zgjidh një nga opsionet(1,2 ose 3): ");
        String opsioni = figura.nextLine();

        //Trekëndëshi
        {
            if (opsioni.equals("1")) {

                int trekendeshi = 5;
                int i, j, k;

                for (i = 0; i < trekendeshi + 1; i++) {
                    for (j = trekendeshi; j > i; j--) {
                        System.out.print(" ");
                    }
                    for (k = 0; k < (2 * i - 1); k++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
            }
            //Drejtkëndëshi
            {

                if (opsioni.equals("2")) {

                    int brinjaa = 3;
                    int brinjab = 5;
                    for (int m = 0; m < brinjaa; m++) {
                        for (int n = 0; n < brinjab; n++) {
                            System.out.print(" * ");
                        }
                        System.out.println();
                    }
                }


            }
            // Katrori
            {
                if (opsioni.equals("3")) {

                    int brinja=4;
                    for (int x = 0; x < brinja; x++) {
                        for (int y = 0; y< brinja; y++) {
                            System.out.print(" * ");
                        }
                        System.out.println();
                    }
                }
            }
            //
        }
    }
}

