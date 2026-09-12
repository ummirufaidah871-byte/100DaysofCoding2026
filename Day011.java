import java.util.Scanner; //Untuk mengimpor class Scanner agar program dapat menerima input dari keyboard
public class Day11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // membuat objek Scanner untuk membaca input dari keyboard

        System.out.println("BIODATA DIRI");

        //  contoh penggunaan scanner di tipe data string
        System.out.print("Nama Lengkap: ");
       // untuk menerima text String
        String Nama = input.nextLine();

          //  Untuk contoh penggunaan scanner di tipe data int
        System.out.print("Tanggal Lahir: ");
        // untuk menerima bilangan int
        int TanggalLahir = input.nextInt();
        System.out.print("Umur: ");
        int Umur = input.nextInt();

          //  contoh penggunaan scanner di tipe data double
        System.out.print("Tinggi Badan: ");
        // Untuk menerima bilangan desimal
        double Tinggi = input.nextDouble();

          //  Contoh penggunaan scanner di tipe data char
        System.out.print("Golongan Darah: ");
        // Untuk menerima satu karakter chart
        char Golongan = input.next().charAt(0);

        // menampilkan data dengan Printf()
        System.out.printf("%-15s : %s%n","Nama", Nama);
        System.out.printf("%-15s : %d%n","Tanggal Lahir", TanggalLahir);
        System.out.printf("%-15s : %d%n", "Umur", Umur);
        System.out.printf("%-15s : %.1fcm%n", "Tinggi badan", Tinggi);
        System.out.printf("%-15s : %c", "Golongan", Golongan);
    }
}
