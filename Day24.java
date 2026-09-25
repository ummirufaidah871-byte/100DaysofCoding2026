import java.util.Scanner;
public class Day24{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int nilai1, nilai2, hasil;
         nilai1 = sc.nextInt();
         nilai2 = sc.nextInt();
         System.out.print("panjang : ");
         System.out.print("lebar : ");
        hasil = nilai1 * nilai2;
        System.out.println("Luas persegi : " + hasil);
        sc.close();
    }
}
