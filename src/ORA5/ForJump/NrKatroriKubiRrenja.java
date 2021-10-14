package ORA5.ForJump;
import java.util.Scanner;
public class NrKatroriKubiRrenja {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);

        System.out.printf("Shkruaj një numër: ");
        int n=reader.nextInt();
        String a="numri";
        String b="katrori";
        String c="kubi";
        String d="rr.katrore";
        System.out.println("----------------------------------------------------------------------");
        System.out.printf("%3s | %6s | %6s | %12s", a,b, c, d );
        System.out.println("\n----------------------------------------------------------------------");
        for (int i=1; i<=n; i++)
            System.out.printf("\n%3d %8d %10d %14.2f", i,i*i, i*i*i, Math.sqrt(i));
        System.out.println("\n----------------------------------------------------------------------");
    }
}
