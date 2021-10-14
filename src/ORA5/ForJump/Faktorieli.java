package ORA5.ForJump;
import java.util.Scanner;
public class Faktorieli {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

		System.out.print("Shkruaj një numër: ");
        int n = scanner.nextInt();
		scanner.close();

        long faktorieli = 1;
        for(int i = 1; i <= n; ++i){
            faktorieli *= i;
        }
        System.out.println("--------------------------");
        System.out.printf("Faktorieli i %d = %d", n, faktorieli);
    }
}
