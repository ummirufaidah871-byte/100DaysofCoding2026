import java.util.Scanner;
public class Day37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bilangan = sc.nextInt();
        if (bilangan > 0) {
            System.out.println("Bilangan Positif");
        } else if (bilangan < 0) {
            System.out.println("Bilangan Negatif");
        } else {
            System.out.println("Nol");
        }
        sc.close();
    }
}
