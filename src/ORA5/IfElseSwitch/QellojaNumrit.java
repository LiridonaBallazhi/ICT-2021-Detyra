package ORA5.IfElseSwitch;
import java.util.Scanner;
public class QellojaNumrit {
    public static void main(String[] args) {
         Scanner reader=new Scanner (System.in);
         int a=8;

         System.out.printf("\nQëllo numrin e gjenereuar nga 1-10: ");
         int b=reader.nextInt();
         System.out.println("\n--------------------------------------");

         if (b == a) {
                System.out.printf("Urime, e keni qëlluar!");
         }
         if (b != 8) {
             System.out.printf("\nSuksese herën tjetër!");
         }
         System.out.println("\n--------------------------------------");

    }


}
