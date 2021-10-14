package ORA5.IfElseSwitch;
import java.util.Scanner;
public class KrahasimiNumrave {
    public static void main(String[] args) {
        Scanner reader =new Scanner (System.in);

        System.out.printf("Numri i parë: ");
        float nr1=reader.nextFloat();
        System.out.printf("Numri i parë: ");
        float nr2=reader.nextFloat();
        System.out.println("------------------------------------");

        if (nr1>nr2){
            System.out.println("Numër më i madh është: "+nr1);
        }
        else {
            System.out.println("Numër më i madh është: "+nr2);
        }


    }
}
