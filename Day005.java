public class Day5 {
    public static void main(String []args){

        // tipe data float (32 bit) untuk menyimpan 6-7 digit angka desimal. disertai huruf f di akhir agar terbaca sebagai data float 
            float talitambang = 126.75f;
        
            // jika lebih dari 7 digit angka, maka sistem akan membulatkan secara otomatis
            float beratbersih = 126.801237f;

        // tipe data double (64 bit) untuk menyimpan 15-16 digit angka desimal
        double phasam =2834.3287537;

        System.out.printf("Tali tambang\t:%.2f cm%n",talitambang);
        System.out.println("berat bersih\t:" + beratbersih +"kg");
        System.out.printf("PH Asam basa\t:%.7fkm" , phasam);
        
    }
}
