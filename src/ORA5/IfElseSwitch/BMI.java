package ORA5.IfElseSwitch;

import java.util.Scanner;

public class BMI {

    public static void main(String [] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Fut peshën në kilogram: ");
            double pesha = sc.nextDouble();
            System.out.print("\nFut gjatësinë në metra: ");
            double gjatesia = sc.nextDouble();
            double BMI = pesha / (gjatesia * gjatesia);
            System.out.println("\nIndeksi i Masës së Trupit (Body Mass Index-BMI) is " + BMI + " kg/m2");

            if (BMI<18.5)
            {
                System.out.println("Është nënpeshë.");
            }
            if (BMI>18.5 && BMI<24.9)
            {
                System.out.println("Është peshë normale.");
            }
            if (BMI>25)
            {
                System.out.println("Është mbipeshë.");
            }
    }
}
