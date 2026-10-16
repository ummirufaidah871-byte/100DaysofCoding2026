import java.util.Scanner;
public class Day46 {
    public static void main(String[] args) {
        Scanner sc= new  Scanner(System.in);
        System.out.println("====Menu Kedai====");
        System.out.println("1. Nasi Goreng, Rp15.000");
        System.out.println("2. Nasi Kuning, Rp19.000");
        System.out.println("3. Nasi Campur, Rp18.000");
        System.out.print("Pilih Menu: ");
        int pilih = sc.nextInt();
        System.out.print("Jumlah porsi: ");
        int jumlah = sc.nextInt();
        int harga = 0;
        String pilihan = "";
        int total = 0;
        switch (pilih) {
            case 1 -> {
                pilihan = "Nasi goreng";
                harga = 15000;
            } case 2 -> {
                pilihan = "Nasi kuning";
                harga = 19000;
            } case 3 -> {
                pilihan = "Nasi campur";
                harga = 18000;
            }
            default -> System.out.println("Menu tidak valid");
        } if (jumlah>0) {
            total = harga * jumlah;
        } else {
            System.out.println("Masukkan jumlah porsi");
        }
        System.out.println("Detail pesanan");
        System.out.println("--------------");
        System.out.println("Menu: "+ pilihan);
        System.out.println("Jumlah: "+ jumlah);
        System.out.println("Total harga: Rp"+ total);
        sc.close();
    }
}
