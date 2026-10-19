import java.util.Scanner;
public class Day49 {
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        int nilai = sc.nextInt();
        System.out.println( (nilai >=85) ? "Lulus" : "Tidak lulus");
        sc.close();
    }
}
