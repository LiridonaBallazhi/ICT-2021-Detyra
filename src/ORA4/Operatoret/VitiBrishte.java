package ORA4.Operatoret;

public class VitiBrishte {
    public static void main(String[] args)
    {
        int viti=Integer.parseInt(args[0]);
        boolean  eshteVitiBrishte;

        eshteVitiBrishte=(viti %4 ==0) && (viti%100!=0);
        eshteVitiBrishte=eshteVitiBrishte ||((viti%400==0));
        System.out.println(eshteVitiBrishte);
    }
}
