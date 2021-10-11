package ORA5.IfElseSwitch;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {

        Scanner menu = new Scanner(System.in);
        System.out.println("Kjo është menuja:");
        String file = "1-File";
        System.out.println(file);
        String edit = "2-Edit";
        System.out.println(edit);
        String view = "3-View";
        System.out.println(view);
        String help = "4-Help";
        System.out.println(help);
        String tools = "5-Tools";
        System.out.println(tools);
        String exit = "6-Exit";
        System.out.println(exit);
        System.out.println("                                         ");
        System.out.printf("Zgjidh një nga opsionet(1,2,3,4,5 ose 6): ");
        String opsioni=menu.nextLine();

        if (opsioni.equals("1")) {
            System.out.println(file);
        }
        if (opsioni.equals("2")) {
            System.out.println(edit);
        }
        if (opsioni.equals("3")) {
            System.out.println(view);
        }
        if (opsioni.equals("4")) {
            System.out.println(help);
        }
        if (opsioni.equals("5")) {
            System.out.println(tools);
        }
        if (opsioni.equals("6")) {
            System.out.println(exit);
        }

    }
}


