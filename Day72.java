import java.util.Scanner;
public class Day72 {
    public static void main(String[] args) {
        Scanner sc= new  Scanner(System.in);
        int angka;
        int total = 0;
        while (true) {
            angka = sc.nextInt();
            if ( angka <0) {
                System.out.println("Angka Negatif");
                break;
            }
            total += angka;
        }
        System.out.println("jumlah keseluruhan bilangan: "+total);
        sc.close();
    }
}
