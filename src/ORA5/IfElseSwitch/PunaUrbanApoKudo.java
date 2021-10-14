package ORA5.IfElseSwitch;
import java.util.Scanner;
public class PunaUrbanApoKudo {
    public static void main(String[] args) {
        Scanner reader=new Scanner (System.in);

        System.out.print("\nGjinia juaj F(femër) ose M(mashkull): ");
        String gjinia=reader.nextLine();

        System.out.printf("Mosha juaj: ");
        int mosha=reader.nextInt();

        System.out.println("----------------------------------------------");


        switch (gjinia){
            case ("F"):
                System.out.println("Do të punosh vetëm në zonat urbane.");
                break;

            case("M"): {
                if (mosha >= 20 & mosha <= 40) {
                    System.out.println("Mund të punosh kudo.");
                }
                if (mosha > 40 & mosha <= 60) {
                    System.out.println("Do të punosh vetëm në zonat urbane.");
                }
                if (mosha>60) {
                    System.out.println("GABIM");
                }
                if (mosha<20){
                    System.out.println("GABIM");
                }
            break;
            }
        }
        System.out.println("----------------------------------------------");


    }
}
