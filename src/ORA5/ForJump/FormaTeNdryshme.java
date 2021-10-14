package ORA5.ForJump;

import java.util.Scanner;

public class FormaTeNdryshme {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.printf("Shkruaj një numër: ");
        int n = reader.nextInt();

        System.out.println("-------------------------------------");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("$");
            }
            System.out.println("");

        }
        System.out.println("-------------------------------------");
        for (int i = n, k = 0; i > 0 && k < n; i--, k++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < k; j++) {
                System.out.print("*");
            }
            for (int j = 1; j < k; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("-------------------------------------");

        for (int i=1; i<=n; i++){
            for (int j=1 ; j<=i; j++){
                System.out.print("#");
            }
            System.out.println();
        }
        for ( int i=n-1 ; i>=1; i--){
            for (int j=1; j<=i;j++){
                System.out.print("#");
            }
            System.out.println();
        }
        reader.close();
        System.out.println("-------------------------------------");

        for (int i=1; i<=n; i++){
            for (int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }

    }
}

