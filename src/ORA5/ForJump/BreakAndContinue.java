package ORA5.ForJump;
import java.util.Scanner;
public class BreakAndContinue {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.printf("Shkruaj një numër: ");
        int n = reader.nextInt();
        System.out.println("--------------------------------");
        System.out.printf("Shkruaj një numër (break): ");
        int m = reader.nextInt();

        for (int i = 0; i <= n; i++){
            if (i == m)
                break;
                System.out.printf(i + " ");

        }

        System.out.printf("\n--------------------------------");
        System.out.print("\nShkruaj një numër (continue): ");
        int p=reader.nextInt();

        for (int j=0; j<=n; j++) {
            if (j == p)
                continue;
                System.out.printf(j + " ");

        }
        System.out.println("\n--------------------------------");
    }
}
