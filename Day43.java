import java.util.Scanner;
public class Day43 {
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        System.out.print("angka: ");
        int angka = sc.nextInt();
        if (angka % 5 == 0 && angka % 3 == 0){
        System.out.println("Angka kelipatan 3 dan 5");
        }else if (angka % 3 == 0){
            System.out.println("Angka kelipatan 3");
        } else if (angka % 5== 0){
            System.out.println("Angka kelipatan 5");
        } else{
            System.out.println("Bukan kelipatan 3 atau 5");
        }
        sc.close();
    }
}
