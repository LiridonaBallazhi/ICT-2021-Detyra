package ORA5.IfElseSwitch;

import java.util.Scanner;

public class RanguVleresLejuar {
    public static void main(String[] args) {
        Scanner reader=new Scanner (System.in);

        System.out.printf("Shkruaj një vlerë: ");
        int a=reader.nextInt();

        System.out.println(
                (a<100) &&(a> -100) ? "Numri është në rangun e dhënë." : "Numri nuk është në rangun e dhënë."
        );




    }
}
