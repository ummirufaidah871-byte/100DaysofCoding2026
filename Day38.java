import java.util.Scanner;
public class Day38 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("========Menu Utama=======");
        System.out.println("1. Kopi Susu Gula Aren\t:Rp12.000");
        System.out.println("2. Café Latte\t\t:Rp15.000");
        System.out.println("3. Caramel Macchiato\t:Rp17.000");
        System.out.println("4. Hazelnut Latte\t:Rp23.000");
        System.out.println("5. Mocha (Mochaccino)\t:Rp19.000");
        System.out.println("=========================");

        System.out.print("Pilih menu (1-5): ");
        int pilihan = input.nextInt();

        System.out.print("Jumlah pesanan: ");
        int jumlah = input.nextInt();

        String nama;
        int harga;

        if (pilihan == 1) {
            nama = "Kopi Susu Gula Aren";
            harga = 12000;
        } else if (pilihan == 2) {
            nama = "Café Latte";
            harga = 15000;
        } else if (pilihan == 3) {
            nama = "Caramel Macchiato";
            harga = 17000;
        } else if (pilihan == 4) {
            nama = "Hazelnut Latte";
            harga = 23000;
        } else if (pilihan == 5) {
            nama = "Mocha (Mochaccino)";
            harga = 19000;
        } else {
            System.out.println("Pilihan tidak valid!");
            input.close();
            return;
        }

        int total = harga * jumlah;

        System.out.println("\n========Struk Pesanan=======");
        System.out.println("Menu   : " + nama);
        System.out.println("Harga  : Rp" + harga);
        System.out.println("Jumlah : " + jumlah);
        System.out.println("Total  : Rp" + total);
        System.out.println("============================");

        input.close();
    }
}
