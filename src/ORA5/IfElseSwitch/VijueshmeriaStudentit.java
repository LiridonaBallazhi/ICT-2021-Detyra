package ORA5.IfElseSwitch;

import java.util.Scanner;

public class VijueshmeriaStudentit {
    public static void main(String[] args) {

        Scanner reader=new Scanner(System.in);
        System.out.printf("Emri dhe mbiemri i studentit: ");
        String emriMbiemri=reader.nextLine();

        System.out.printf("\nTë shkruhet numri i orëve për lëndë: ");
        double a=reader.nextInt();

        System.out.printf("\nTë shkruhet numri i orëve që ka ndjekë studenti: ");
        double b=reader.nextInt();
        System.out.println("-------------------------------------------------------------");

        double c= (float)  ((b/a)*100);

        System.out.println("Pjesëmarrja e studentit në ligjërata: " + c + "%" );


        if (c>=0 && c<50) {
            System.out.printf("%s nuk i plotëson kushtet për provim.", emriMbiemri);
        }

        if (c>=50 && c<100) {
            System.out.printf("%s i plotëson kushtet për provim.", emriMbiemri);
        }
        if(c==100) {
            System.out.printf("%s plotëson kushtet për provim dhe ka 10 pikë bonus për lëndën.", emriMbiemri);
        }

        System.out.println("\n-------------------------------------------------------------");

    }
}
