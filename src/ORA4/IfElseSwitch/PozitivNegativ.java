package ORA4.IfElseSwitch;

import java.util.Scanner;

public class PozitivNegativ {

        /*Scanner teksti = new Scanner(System.in);
        System.out.print("Shkruaj një tekst: ");
        String a = teksti.nextLine();  //a->teksti origjinal

        //a.b)Numrin e karaktereve të tekstit
        String b=a.replaceAll(" ", "");  //b=teksti i ri pa hapësirat
        System.out.println("Teksti i ri pa hapësira është "+b);
        System.out.println("Numri i karaktereve të tekstit është "+b.length());

        //b)

       //d) gjej tekstin


         */
        public static void main(String[] args) {
            Scanner reader = new Scanner(System.in);
            System.out.println("Shkruaj një numër dhe gjejmë se a është pozitiv apo negativ:");
            int numri = reader.nextInt();

            if (numri > 0) {
                System.out.println("Numri eshte pozitiv");
            } else if (numri < 0)
                System.out.println("Numri eshte negativ");
            else
                System.out.println("Numri eshte 0.");

            System.out.println("Ky kode do te ekzetuhet vetem ne else - dhe kjo nuk është e saktë");
        }

    }

