import java.util.Scanner;
public class Day20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int TB = sc.nextInt();
        String nominal = String.valueOf(TB);
        System.out.printf("Total Harga : %d%nJumlah Yang Harus Dibayarkan : Rp.%s",TB, nominal);
        sc.close();
    }
}
