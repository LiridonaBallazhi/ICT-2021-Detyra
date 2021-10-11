package ORA5.IfElseSwitch;

import java.util.Scanner;

public class Semafori {
    public static void main(String[] args) {

        Scanner reader=new Scanner (System.in);

        System.out.printf("Shtyp një numër për semaforin: ");
        int semafori=reader.nextInt();

        if (semafori==1)
        {
            System.out.println("Semafori është i kuq.");
        }
        if ( semafori==2)
        {
            System.out.println("Semafori është i verdhë.");
        }
        if (semafori==3)
        {
            System.out.println("Semafori është i gjelbër.");
        }
        if (semafori==4)
        {
            System.out.println("Semafori është duke blinkuar.");
        }
        else
        {
            System.out.println("Semafori nuk është i lëshuar");
        }

    }
}
