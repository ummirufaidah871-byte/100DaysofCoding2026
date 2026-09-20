import java.util.Scanner;

public class Day19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nilai = sc.nextDouble();
        float A = (float) nilai;
        long B = (long) nilai;
        int C = (int) nilai;
        short D = (short) nilai;
        byte E = (byte) nilai;

        System.out.printf("double :%f%nfloat :%f%nlong: %d%nint :%d%nshort :%d%nbyte :%d%n",nilai,A,B,C,D,E);
        sc.close();
    }
}
