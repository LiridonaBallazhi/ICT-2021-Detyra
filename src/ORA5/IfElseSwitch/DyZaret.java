package ORA5.IfElseSwitch;
import java.util.Scanner;
public class DyZaret {
    public static void main(String[] args) {

        Scanner reader=new Scanner(System.in);


        System.out.printf("\nNumri i zarit të parë: ");
        int a=reader.nextInt();
        System.out.printf("Numri i zarit të dytë: ");
        int b=reader.nextInt();
        int c=12;
        c = a + b;
        System.out.println("---------------------------------------");

        if (c==12)
        {
            System.out.printf("Urime, keni fituar!");
            System.out.printf("\n---------------------------------------");
        }
        else{
            System.out.println("Suksese herën tjetër!");
            System.out.printf("---------------------------------------");

        }

    }
}
