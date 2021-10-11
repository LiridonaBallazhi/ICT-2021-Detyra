package ORA5.IfElseSwitch;

import java.util.Scanner;

public class Plotepjestueshmeria {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.print("Shkruaj numrin e parë: ");
        int nr1 = reader.nextInt();
        System.out.print("Shkruaj numrin e dytë: ");
        int nr2 = reader.nextInt();

        if (nr1 % nr2 == 0) {
            System.out.printf("%d është i plotëpjestueshëm me %d. %n", nr1, nr2);
        }
        else
        {
            System.out.printf("%d nuk është i plotëpjestuesham me %d. %n", nr1, nr2);
        }
        if (nr2 % nr1 ==0)
        {
            System.out.printf("Por %d është i plotëpjestueshëm me %d. %n", nr2, nr1);
        }
    }
}
