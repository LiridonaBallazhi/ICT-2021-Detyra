package ORA5.IfElseSwitch;
import java.util.Scanner;
public class ZbritjeDyqan {

    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);

        int njesia=100;
        System.out.printf("Shtyp sasinë e njësive që keni blerë: ");
        int sasia=reader.nextInt();
        int kostoja=njesia*sasia;
        System.out.println("---------------------------------------------------------------------------------------------");
        System.out.printf("Kostoja e sasisë që keni blerë është: "+ kostoja+ " EUR");


        if (kostoja>1000){
                System.out.println("\nJeni përfitues i zbritjes prej 10%, andaj kostoja juaj për pagesë është: " +
                        (kostoja-(kostoja*10/100))+" EUR");
            System.out.println("---------------------------------------------------------------------------------------------");
            }
        }
}

