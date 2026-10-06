import java.util.Scanner;
public class Day35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int umur = sc.nextInt();
if (umur >= 13) {
    System.out.println("Boleh masuk");
    if (umur >= 60) {
        System.out.println("Diskon lansia");
    } else {
        System.out.println("Harga normal");
    }
} else {
    System.out.println("Tidak boleh masuk");
}
sc.close();
    }
}
