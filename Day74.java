import java.util.Scanner;
public class Day75 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan teks: ");
        String teks = sc.nextLine();

        System.out.println("Huruf Kapital: "+ teks.toUpperCase());
        System.out.println("Huruf Kecil: "+ teks.toLowerCase());
        System.out.println("Jumlah Karakter: "+ teks.length());
        sc.close();
    }
}
