import java.util.Scanner;

public class Day22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nilaiA = sc.nextInt();
        int nilaiB = sc.nextInt();

        System.out.println("nilai sebelum ditukar =");
        System.out.println("nilai A : "+ nilaiA);
        System.out.println("nilai B : "+ nilaiB);

        int temp = nilaiA;
        nilaiA = nilaiB;
        nilaiB = temp;

        System.out.println("Setelah ditukar ");
        System.out.println("Nilai A : " + nilaiA);
        System.out.println("Nilai B : " + nilaiB);
        sc.close();
    }
}
