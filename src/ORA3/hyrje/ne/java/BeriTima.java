package ORA3.hyrje.ne.java;

public class BeriTima {
    public static void main(String[] args) {
        int eurot=33;
        int centet=16;
        int parate=(eurot*100)+centet;
        System.out.println("5 euro = "+parate/500);
        parate=parate%500;
        System.out.println("2 euro = "+parate/200);
        parate=parate%200;
        System.out.println("1 euro = "+parate/100);
        parate=parate%100;
        System.out.println("50 centëshe = "+parate/50);
        parate=parate%50;
        System.out.println("20 centëshe = "+parate/20);
        parate=parate%20;
        System.out.println("10 centëshe = "+parate/10);
        parate=parate%10;
        System.out.println("5 centëshe = "+parate/5);
        parate=parate%5;
        System.out.println("2 centëshe = "+parate/2);
        parate=parate%2;
        System.out.println("1 centëshe = "+parate/1);
        parate=parate%1;
    }
}
