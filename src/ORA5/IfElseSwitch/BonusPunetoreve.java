package ORA5.IfElseSwitch;
import java.util.Scanner;
public class BonusPunetoreve {
    public static void main(String[] args) {

        Scanner reader=new Scanner(System.in);

        System.out.printf("Paga juaj: ");
        double paga=reader.nextDouble();
        System.out.printf("Viti kur keni filluar punë: ");
        int vitiSherbimit=reader.nextInt();
        int vitiAktual=2021;
        int a=vitiAktual-vitiSherbimit;

        System.out.println("----------------------------------------------");
        if (a>5){
            System.out.println("Shuma neto e bonusit: "+ (paga+(paga*5/100))+ " EUR");
        }
        else{
            System.out.println("Vazhdoni të punoni për ne, që të përfitoni bonuse!");
        }
        System.out.println("----------------------------------------------");
    }
}
