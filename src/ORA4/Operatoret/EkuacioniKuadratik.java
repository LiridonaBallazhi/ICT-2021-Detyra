package ORA4.Operatoret;

 public class EkuacioniKuadratik {
    public static void main(String[] args) {
        double b=Double.parseDouble(args[0]);
        double c=Double.parseDouble(args[1]);

        double diskriminanta=b*b-4.0*c;
        double d=Math.sqrt(diskriminanta);
        double rrenja1=(-b+d)/2.0;
        double rrenja2=(-b-d)/2.0;

        System.out.println(rrenja1);
        System.out.println(rrenja2);

    }
}
