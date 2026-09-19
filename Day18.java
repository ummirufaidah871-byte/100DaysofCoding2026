import java.util.Scanner;
public class Day18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte angka = sc.nextByte();
        short A = angka;
        int B = angka;
        long C = angka;
        float D = angka;
        double E = angka;

        System.out.printf("byte :%d%nshort :%d%nint :%d%nlong :%d%nfloat :%.2f%ndouble :%.2f%n", angka, A, B, C, D, E);
        sc.close();
    }
}
