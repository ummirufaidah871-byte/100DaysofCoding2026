import java.util.Scanner;
public class Day16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
          int angka1 = sc.nextInt();
          int angka2 = sc.nextInt();

          System.out.println("Hasil: " + angka1 % angka2);
          sc.close();
    }
}
