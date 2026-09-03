public class BiodataDiri {
    public static void main(String[] args) {
        String nama = "Ummi Rufaidah Hamka";
        String tempatLahir = "Kampung Baru";
        String tanggalLahir = "1 Juli 2007";
        String ProgramStudi = "Pendidikan Teknologi Informasi";
        int tinggiBadan = 150;

        // Menggunakan println() Untuk mencetak dan pindah baris otomatis
        System.out.println("BIODATA DIRI ");
        System.out.println("Nama          : " + nama);
        System.out.println("Tempat Lahir  : " + tempatLahir);

        // Menggunakan print() Untuk mencetak tanpa pindah baris
        System.out.print("Tanggal Lahir : ");
        System.out.println(tanggalLahir);

        // Menggunakan printf() Untuk mencetak dengan format khusus
        System.out.printf("Tinggi Badan  : %d cm%n", tinggiBadan);
        System.out.printf("Program Studi : %s%n", ProgramStudi);

        // %n digunakan untuk membuat baris baru dalam printf()
        // %d digunakan untuk menampilkan angka bulat
        // %s digunakan untuk menampilkan string
    }
}
