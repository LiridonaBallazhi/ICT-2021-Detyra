package ORA5.IfElseSwitch;
import java.util.Scanner;
public class DrejtkendeshApoKatror {

    public static void main(String[] args) {

        Scanner reader=new Scanner(System.in);
        System.out.printf("Jep gjatësinë e brinjës a: ");
        int a=reader.nextInt();

        System.out.printf("Jep gjatësinë e brinjës b: ");
        int b=reader.nextInt();
        System.out.println("----------------------------------------------------");

        int i=1;
        while( i<=a){
            int j=1;
            while(j<=b){
                System.out.print(" * ");
                j++;
            }
            System.out.print("\n");
            i++;
        }
        if (a==b)
        {
            System.out.printf("----------------------------------------------------");
            System.out.printf("\nFigura më sipër është katror.");
        }
        else
        {
            System.out.printf("----------------------------------------------------");
            System.out.printf("\nFigura më sipër nuk është katror.");
        }

    }
}
