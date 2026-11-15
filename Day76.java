import java.util.Scanner;
public class Day76 {
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        String teks = sc.nextLine();
        System.out.println(teks.trim());
        System.out.println(teks.substring(10));
        System.out.println(teks.replace("Java", "Phyton"));
        sc.close();
    }
}
