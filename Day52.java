import java.util.Scanner;
public class Day52 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String password = "";
        while (!password.equals("rahasia")) {
            System.out.print("Masukkan password: ");
            password = sc.nextLine();
        }
        System.out.println("Berhasil masuk!");
        sc.close();
    }
}
