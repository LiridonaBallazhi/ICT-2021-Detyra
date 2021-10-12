package ORA5.IfElseSwitch;
import java.util.Scanner;
public class TekstiIndeksi {
    public static void main(String[] args) {

        Scanner reader=new Scanner (System.in);

        System.out.println("Shkruaj një tekst: ");
        String teksti=reader.nextLine();

        int indeksi = 0;

        for (int i=0; i<teksti.length(); i++)
        {
            if (teksti.charAt(i) !=' ')
                indeksi++;
        }
        System.out.println("Numri total i tekstit të dhënë është: " + indeksi);

        System.out.println("---------------------------------------------------");

        System.out.print("Shkruaj tekstin nga indeksi 0 deri në: ");
        int a=reader.nextInt();
        System.out.println("*"+teksti.substring(0,a)+"*");

        System.out.println("---------------------------------------------------");

        System.out.print("Shkruaj tekstin pas indeksit: ");
        int b=reader.nextInt();
        System.out.println("*"+teksti.substring(b)+"*");

        System.out.println("---------------------------------------------------");

        System.out.print("Shkruaj indeksin e fillimit të tekstit: ");
        int c=reader.nextInt();
        System.out.print("Shkruaj indeksin e mbarimit të tekstit: ");
        int d=reader.nextInt();
        System.out.println("Teksti është "+ "*" + teksti.substring (c,d)+ "*");

        System.out.println("---------------------------------------------------");

        Scanner lexuesi=new Scanner(System.in);
        System.out.println("Kërko fjalën: ");
        String fjala=lexuesi.nextLine();

        if(teksti.contains(fjala)) {
            System.out.println("Fjala që keni kërkuar është gjetur.");
        }else
            System.out.println("Fjala që keni kërkuar nuk është gjetur.");

        int indeksiFillimit=teksti.indexOf(fjala);
        System.out.println("Dhe fjala e kërkuar fillon nga indeksi " + indeksiFillimit);

        System.out.println("---------------------------------------------------");

        System.out.println("Shkruaj tekstin qe po kërkoni ta zëvendësoni: ");
        String fjala1=lexuesi.nextLine();

        System.out.println("Shkruani tekstin zëvendësues: ");
        String fjalaTjeter=lexuesi.nextLine();

        System.out.println("                                                    ");

        if(teksti.contains(fjala1)) {
            System.out.println("Teksti me ndryshime është: ");
            String tekstiNdryshe = teksti.replace(fjala1, fjalaTjeter);
            System.out.println(tekstiNdryshe);
        }
        else {
            System.out.println("Fjala që keni kërkuar për tu zëvendësuar nuk gjendet ne tekstin e dhënë\n" +
                    "dhe teksti nuk pësoi ndryshime.");
        }

    }

}


