import java.util.Scanner;
public class Day86 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah data: ");
        int jumlah = input.nextInt();
        int[] angka = new int[jumlah];

        for (int i = 0; i < jumlah; i++) {
            System.out.print("Masukkan angka ke-" + (i + 1) + ": ");
            angka[i] = input.nextInt();
        }

        System.out.print("\nMasukkan angka yang dicari: ");
        int target = input.nextInt();

        int indeksDitemukan = -1;
        for (int i = 0; i < angka.length; i++) {
            if (angka[i] == target) {
                indeksDitemukan = i;
                break; 
            }
        }

        if (indeksDitemukan != -1) {
            System.out.println("Angka " + target + " ditemukan pada indeks ke-" + indeksDitemukan);
        } else {
            System.out.println("Angka " + target + " tidak ditemukan dalam array.");
        }
        input.close();
    }
}
