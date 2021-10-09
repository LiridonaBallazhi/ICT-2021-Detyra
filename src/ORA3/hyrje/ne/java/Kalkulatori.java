package ORA3.hyrje.ne.java;

import java.util.Scanner;

public class Kalkulatori {
    public static void main(String[] args) {
        Scanner reader = new Scanner (System.in);

        System.out.print("Numri 1: ");
        int a=reader.nextInt();
        System.out.print("Numri 2: ");
        int b=reader.nextInt();

        System.out.println(a + "+" + b + "=" + (a+b));
        System.out.println(a + "-" + b + "=" + (a-b));
        System.out.println(a + "*" + b + "=" + (a*b));
        System.out.println(a + "/" + b + "=" + (a/b));
        System.out.println(a + "%" + b + "=" + (a%b));
    }
}
