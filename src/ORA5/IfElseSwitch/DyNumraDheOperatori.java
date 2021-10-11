package ORA5.IfElseSwitch;

import java.util.Scanner;

public class DyNumraDheOperatori {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.printf("Numri 1: ");
        double a = reader.nextDouble();


        System.out.printf("Numri 2: ");
        double b = reader.nextDouble();

        System.out.println("Operatori (+,-,/,*,%): ");
        char operatori = reader.next().charAt(0);
        double mbledhja = a + b;
        double zbritja = a - b;
        double shumezimi = a * b;
        double pjesetimi = a / b;
        double mbetja = a % b;

        switch (operatori)
        {
            case '+':
            {
                System.out.print("Totali pas mbledhjes është: " + mbledhja);
                break;
            }
            case '-': {
                System.out.print("Totali pas zbritjes është : " + zbritja);
                break;
            }
            case '*': {
                System.out.print("Totali pas shumëzimit është : " + shumezimi);
                break;
            }
            case '/': {
                System.out.print("Totali pas pjesëtimit është : " + pjesetimi);
                break;
            }
            case '%': {
                System.out.print("Totali pas mbetjes është: " + mbetja);
            }

        }
    }
}
