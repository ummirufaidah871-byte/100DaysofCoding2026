public class Day4 {
    public static void main(String[] args) {
        
        // tipe data numerik bilangan bulat byte 8 bit
        byte tinggiBadan = 120;
        System.out.printf( "tinggi badan\t:%d cm%n", tinggiBadan);

        // tipe data numerik bilangan bulat short 16 bit
        short lebartabung = 2334;
        System.out.printf("Lebar tabung\t:%,d m%n", lebartabung);

        // tipe data numerik bilangan bulat int 32 bit
        int totalharga = 560000;
        System.out.printf("Total harga\t:Rp%,d%n",totalharga);

        // tipe data numerik bilangan bulat long 64 bit
        long kerugian = 25700000000000L;
        // nilai long yang melampaui batas nilai int harus menggunakan suffix (L) di akhir angka
        System.out.printf("Kerugian\t:Rp%,d%n",kerugian);
    }
}
