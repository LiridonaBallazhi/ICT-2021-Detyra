package ORA3.hyrje.ne.java;

import java.util.Scanner;


    /*
Shkruaje këtë varg të urdhërave në Java:
1. Nje ndryshore parate_e_mija inicializohet me 12
2. parate_e_mija zvogëlohet për 5
3. parate_e_mija dyfishohet
4. parate_e_mija resetohet, rivendoset në 1
5. Vlera e ndryshores parate_e_mija i dërgohet në një println-mesazh objektit
 */
    public class ParateMija {
        public static void main(String[] args) {
            Scanner reader = new Scanner(System.in);
            int parate_e_mija = 12 ;
            System.out.println(parate_e_mija);
            parate_e_mija -= 5;
            System.out.println(parate_e_mija);
            parate_e_mija *= 2;
            System.out.println(parate_e_mija);
            parate_e_mija = 1;
            System.out.println(parate_e_mija);
            System.out.print("Vendos vlerën e parate_e_mija: ");
            Double parate_e_mija1=reader.nextDouble();


        }
    }

