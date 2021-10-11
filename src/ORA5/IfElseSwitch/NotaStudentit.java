package ORA5.IfElseSwitch;

import java.util.Scanner;

public class NotaStudentit {
    public static void main(String[] args) {

        Scanner reader=new Scanner (System.in);
        System.out.printf("Shkruaj pikët e provimit: ");
        Double piketProvim=reader.nextDouble();

        if (piketProvim < 50) {
            System.out.println("Nota 5 ");
        }
        if (piketProvim >= 50 && piketProvim<60) {
            System.out.println("Nota 6 ");
        }
        if (piketProvim >= 60 && piketProvim<70) {
            System.out.println("Nota 7 ");
        }
        if (piketProvim >= 70 && piketProvim<79) {
            System.out.println("Nota 8 ");
        }
        if (piketProvim >= 80 && piketProvim<89) {
            System.out.println("Nota 9 ");
        }
        if (piketProvim >= 90 && piketProvim<=100) {
            System.out.println("Nota 10 ");
        }
        if (piketProvim <0) {
            System.out.println("Nuk lejohet ");
        }
        if (piketProvim >100) {
            System.out.println("Nuk lejohet");
        }
    }

}
