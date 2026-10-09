import java.util.Scanner;

public class Day38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("========Menu Utama=======");
        System.out.println("1. Kopi Susu Gula Aren\t:Rp12.000");
        System.out.println("2. Café Latte\t\t:Rp15.000");
        System.out.println("3. Caramel Macchiato\t:Rp17.000");
        System.out.println("4. Hazelnut Latte\t:Rp23.000");
        System.out.println("5. Mocha (Mochaccino)\t:Rp19.000");
        System.out.println("=========================");

        System.out.print("Pilih menu: ");
        int pilih = sc.nextInt();

        if (pilih == 1) {
            System.out.println("Pesanan anda: Kopi Susu Gula Aren: Rp12.000");
        } else if (pilih == 2) {
            System.out.println("Pesanan anda: Café Latte: Rp15.000");
        } else if (pilih == 3) {
            System.out.println("Pesanan anda: Caramel Macchiato: Rp17.000");
        } else if (pilih == 4) {
            System.out.println("Pesanan anda: Hazelnut Latte: Rp23.000");
        } else if (pilih == 5) {
            System.out.println("Pesanan anda: Mocha (Mochaccino): Rp19.000");
        } else {
            System.out.println("Pilihan tidak valid!");
            input.close();
        }
    }
