package ORA5.IfElseSwitch;

import java.util.Scanner;

public class ShkallezimiPages {
    public static void main(String[] args) {
        Scanner reader=new Scanner (System.in);

        System.out.printf("Shkruaj pagën tënde mujore: ");
        double paga= reader.nextDouble();

        if (paga==0) {
            System.out.printf("Pa pagë");
        }
        if (0<paga && paga<=80) {
            System.out.printf("Social");
        }
        if (80<paga && paga<=120) {
            System.out.printf("Social ose pensioner");
        }
        if (120<paga && paga<=180) {
            System.out.printf("Pagë minimale");
        }
        if (180<paga && paga<=300) {
            System.out.printf("Pagë mesatare");
        }
        if (300<paga && paga<=400) {
            System.out.printf("Pagë e mirë");
        }
        if (400<paga && paga<=600) {
            System.out.printf("Pagë mbi mesataren e mirë");
        }
        if (600<paga) {
            System.out.printf("Pagë e lartë");
        }
    }
}
