import java.util.Scanner;

public class day88 {

    static void inputDanCetakBiodata(Scanner input) {
        System.out.print("Masukkan nama: ");
        String nama = input.nextLine();

        System.out.print("Masukkan umur: ");
        int umur = input.nextInt();

        System.out.println("\n--- Hasil Biodata ---");
        System.out.println("Nama : " + nama);
        System.out.println("Umur : " + umur + " tahun");
    }

    static void hitungLuasSegitiga(Scanner input) {
        System.out.print("\nMasukkan alas: ");
        double alas = input.nextDouble();

        System.out.print("Masukkan tinggi: ");
        double tinggi = input.nextDouble();

        double luas = 0.5 * alas * tinggi;
        System.out.println("Luas segitiga: " + luas);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        inputDanCetakBiodata(scanner);
        hitungLuasSegitiga(scanner);

        scanner.close();
    }
}
