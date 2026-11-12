import java.util.Scanner;
public class Day73 {
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        int pilih;
        do{
            System.out.println("===Menu Warung===");
            System.out.println("1. Nasi Campur");
            System.out.println("2. Nasi Goreng");
            System.out.println("3. Nasi Kuning");
            System.out.println("4. Nasi Unduk");
            System.out.println("==============");
            
            System.out.print("Masukkan Pilihan: ");
            pilih=sc.nextInt();

            switch (pilih) {
                case 1 ->
                System.out.println("Menu yang dipilih: Nasi Campur");
                case 2 ->
                System.out.println("Menu yang dipilih: Nasi Goreng");
                case 3 ->
                System.out.println("Menu yang dipilih: Nasi Kuning");
                case 4 ->
                System.out.println("Menu yang dipilih: Nasi Uduk");
                default->
                    System.out.println("Pilihan Tidak Valid");
            }
        }while (pilih !=5) ;
        sc.close();        
    }
}
