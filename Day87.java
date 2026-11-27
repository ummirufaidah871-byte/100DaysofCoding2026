import java.util.Scanner;
public class Day87 {
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        System.out.print("Masukkan jumlah elemen: ");
        int jumlah = sc.nextInt();
        int[] elemen = new int[jumlah];
        for (int i = 0; i < elemen.length; i++) {
            elemen[i] = sc.nextInt();
        }
        for (int i = 0; i < elemen.length; i++) {
            System.out.println("Indeks ke " + i + " = " + elemen[i]);
        }
        System.out.print("Masukkan indeks: ");
        int indeks = sc.nextInt();
        System.out.print("Masukkan elemen: ");
        elemen[indeks] = sc.nextInt();
        for (int i = 0; i < elemen.length; i++) {
            System.out.println("Indeks ke " + i + " = " + elemen[i]);
            
        }
        sc.close();
    }
}
