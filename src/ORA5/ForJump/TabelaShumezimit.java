package ORA5.ForJump;
import java.util.Scanner;
public class TabelaShumezimit {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        System.out.printf("Të shkruhet tabela e shumëzimit për numrin: ");
        int numri=reader.nextInt();
        System.out.println("----------------------------------------------");

        for (int i=1; i<=numri;i++){
            System.out.println(i+ " * "+numri +" = "+i*numri);
        }
       System.out.println("----------------------------------------------");
    }
}
