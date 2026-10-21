import java.util.Scanner;
public class Day50 {
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        int nilai = sc.nextInt();
        System.out.println( (nilai % 2 == 0) ? "Bilangan genap" : "Bilangan ganjil");
        sc.close();
    }
}
