import java.util.Scanner;
public class Day64 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int hasil = 1;
        for (int i = 1; i <= a; i++) {
         hasil *= i;
        }
        System.out.println(hasil);   
        sc.close();
    }
}
