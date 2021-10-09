package ORA4.ConvertCasting;

public class Convert {

    public static void main(String[] args) {
        int i=40000;
        byte b=78;
        char c='c';
        short s=1024;
        float f=5.67f;
        double d=0.1234;
        double rezultati=(f*b)+(i/c)-(d*s);
        System.out.println("f*b="+(f*b));
        System.out.println("i/c="+(i/c));
        System.out.println("d*s="+(d*s));
        System.out.println("Rezultati="+rezultati);

    }
}
