package ORA3.hyrje.ne.java;

import java.util.Scanner;

public class EKuleta {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);

        System.out.printf("Sa 1 centësh:  ");
        int a=reader.nextInt();
        System.out.printf("Sa 2 centësh:  ");
        int b=reader.nextInt();
        System.out.printf("Sa 5 centësh:  ");
        int c=reader.nextInt();
        System.out.printf("Sa 10 centësh: ");
        int d=reader.nextInt();
        System.out.printf("Sa 20 centësh: ");
        int e=reader.nextInt();
        System.out.printf("Sa 50 centësh: ");
        int f=reader.nextInt();
        System.out.printf("Sa 1 euro:     ");
        int g=reader.nextInt();
        System.out.printf("Sa 2 euro:     ");
        int h=reader.nextInt();

        System.out.println ("--------------------------------------------" );
        System.out.printf ("1 centësh:  %5d   %10.2f  EUR %n", a , a*0.01 );
        System.out.printf ("2 centësh:  %5d   %10.2f  EUR %n", b , b*0.02 );
        System.out.printf ("5 centësh:  %5d   %10.2f  EUR %n", c , c*0.05 );
        System.out.printf ("10 centësh: %5d   %10.2f  EUR %n", d , a*0.10 );
        System.out.printf ("20 centësh: %5d   %10.2f  EUR %n", e , e*0.20 );
        System.out.printf ("50 centësh: %5d   %10.2f  EUR %n", f , f*0.50 );
        System.out.printf ("1 eurosh:   %5d   %10.2f  EUR %n", g , g*1.00 );
        System.out.printf ("2 eurosh:   %5d   %10.2f  EUR %n", h , h*2.00 );
        System.out.println ("--------------------------------------------" );

        System.out.printf("Totali:%24.2f EUR %n", (a*0.01+b*0.02+c*0.05+a*0.10+e*0.20+f*0.50+g*1.00+h*2.00 ));
        System.out.println ("--------------------------------------------" );



    }
}
