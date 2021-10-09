package ORA3.hyrje.ne.java;

import java.util.Scanner;

public class Syprina {
    public static void main(String[] args) {
        Scanner reader=new Scanner (System.in);

        System.out.print("Gjatësia e brinjës a: ");
        Double a1=reader.nextDouble();
        System.out.println("Syprina e katrorit është: "+ a1*a1);
        System.out.println("------------------------------------");

        System.out.print("Gjatësia e brinjës x: ");
        Double x1=reader.nextDouble();
        System.out.print("Gjatësia e brinjës y: ");
        Double y1=reader.nextDouble();
        System.out.println("Syprina e drejtkëndëshit është: "+ x1*y1);
        System.out.println("------------------------------------");

        System.out.print("Gjatësia e rrezes r: ");
        Double r1=reader.nextDouble();
        System.out.println("Syprina e rrethit është: "+ Math.PI*r1*r1);
        System.out.println("------------------------------------");

        System.out.print("Gjatësia e brinjës c: ");
        Double c1=reader.nextDouble();
        System.out.print("Gjatësia e brinjës d: ");
        Double d1=reader.nextDouble();
        System.out.println("Syprina e trekëndëshit është: "+ c1*d1/2);
        System.out.println("------------------------------------");

        System.out.print("Gjatësia e brinjës a: ");
        Double a2=reader.nextDouble();
        System.out.println("Perimetri i katrorit është: "+ 4*a2);
        System.out.println("------------------------------------");

        System.out.print("Gjatësia e brinjës x: ");
        Double x2=reader.nextDouble();
        System.out.print("Gjatësia e brinjës y: ");
        Double y2=reader.nextDouble();
        System.out.println("Perimetri i drejtkëndëshit është: "+ 2*(x2+y2));
        System.out.println("------------------------------------");

        System.out.print("Gjatësia e rrezes r: ");
        Double r2=reader.nextDouble();
        System.out.println("Perimetri i rrethit është: "+ 2* Math.PI*r2);
        System.out.println("------------------------------------");

        System.out.print("Gjatësia e brinjës c: ");
        Double c2=reader.nextDouble();
        System.out.print("Gjatësia e brinjës d: ");
        Double d2=reader.nextDouble();
        System.out.print("Gjatësia e brinjës e: ");
        Double e=reader.nextDouble();
        System.out.println("Perimetri i trekëndëshit është: "+ (c2+d2+e));
        System.out.println("------------------------------------");

        System.out.print("Gjatësia e brinjës l: ");
        Double l=reader.nextDouble();
        System.out.print("Gjatësia e brinjës m: ");
        Double m=reader.nextDouble();
        String c="hipotenuza";
        System.out.println("Hipotenuza c është: "+ Math.sqrt((l*l)+(m*m)));
        System.out.println("------------------------------------");

    }
}
