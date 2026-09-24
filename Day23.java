import java.util.Scanner;
public class Day23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nilai1, hasil;
        System.out.print("sisi : ");
        nilai1 = sc.nextInt();
        hasil = nilai1 * nilai1;
        System.out.println("Luas persegi : " + hasil);
        sc.close();
    }
}
