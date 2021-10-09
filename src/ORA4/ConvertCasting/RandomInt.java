package ORA4.ConvertCasting;

public class RandomInt {
    public static void main(String[] args) {
        int nr = 100;
        double rnd = Math.random();
        int numri = (int) (rnd * nr);
        System.out.println(numri);
    }
}
