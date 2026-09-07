public class Day6 {
    public static void main(String[] args) {
        // tipe data char (karakter) untuk menyimpan 1 karakter baik berupa angka, huruf, simbol atau karakteer khusus yang di apit tanda kutip tunggal ('').
        char huruf = 'U';
            System.out.println("huruf:" + huruf);
        char angka = '7';
            System.out.println("Angka:" + angka);
        char simbol = '!';
            System.out.println("simbol:" + simbol);

        // tipe data double tipe data yang menyimpan kondisi benar/salah
        int nilai = 80;
        boolean status = (nilai >75); // kondisi yang dipenuhi agar bernilai true
        System.out.println("status:"+ status);

        // contoh jika ada dua kondisi menggunakan if else
            int nilaiujian = 80;
            if (nilaiujian >=80){ // otomatis di deklarasikan sebagai tipe data boolean karena bernilai true / false
                System.out.println("Anda LULUS!");
            } else {
                System.out.println("Anda TIDAK LULUS");
            }
        
    }
}
