public class Day7 {
    public static void main(String[] args) {
        // Tipe data string dapat berisi huruf, angka, atau simbol dan diapit oleh tanda kutip ganda
        String Nama =  "ummi";
        String ttl = "01-07-2007";
        String  simbol = "!@#$%^";
        System.out.println("Nama Saya:"+ Nama);
        System.out.println("tanggal lahir:"+ ttl);
        System.out.println("Simbol:"+ simbol);
        // metode concat untuk mmenggabungkan tipe data string
        System.out.println("Nama\t:".concat(" Ummi"));
        // metode tuUppercase: mengubah data string menjadi huruf kapital
        System.out.println("Huruf besar:"+" nama".toUpperCase()); 
        //metode tuLowercase: mengubah data string menjadi huruf kecil
        System.out.println("Huruf kecil:"+" UMMI".toLowerCase());
        //metode lenght: untuk mengetahui panjang string
        System.out.println("Jumlah string:"+"ummi".length());
        //metode replace: mengganti bagian teks
        System.out.println("kocak".replace("c", "l"));
    }
}
