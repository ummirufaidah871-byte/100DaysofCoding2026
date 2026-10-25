import java.util.Scanner;
public class DAy54 {
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);;
        long n = sc.nextLong();
        long hasil = n * (n + 1) / 2;
        System.out.println(hasil);
        sc.close();
    }
}
