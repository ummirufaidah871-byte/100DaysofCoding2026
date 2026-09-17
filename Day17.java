import java.util.Scanner;

public class Day17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int saldo = sc.nextInt();

        int tambahan = sc.nextInt();
        int admin = sc.nextInt();
        int ganda = sc.nextInt();
        int sharing = sc.nextInt();
        int sisa = sc.nextInt();

        System.out.printf("Saldo awal: %d%n Jumlah Saldo: %d%n Setelah dipotong admin: %d%n Penggandaan saldo: %d%n saldo setelah dibagi: %d%n Sisa saldo: %d%n",saldo, saldo += tambahan, saldo -= admin, saldo *= ganda, saldo /= sharing, saldo %= sisa);
        sc.close();
    }
}
