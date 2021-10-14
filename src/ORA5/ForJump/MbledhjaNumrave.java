package ORA5.ForJump;
import java.util.Scanner;
public class MbledhjaNumrave {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);

        System.out.printf("Shkruaj një numër: ");
        int numri=reader.nextInt();
        System.out.println("---------------------------");

        for (int i=0; i<=numri; i++){
            System.out.println(i+ " + " + numri + " = "+ (i+numri));
        }
       System.out.println("----------------------------");


    }
}
