import java.util.Arrays;
import java.util.Scanner;
public class Day85 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int angka = sc.nextInt();
        int [] array = new int[angka];
        for (int i = 0; i < array.length; i++) {
            array [i] = sc.nextInt();
        }
        int num_max = Arrays.stream(array).min().orElse(0);
        System.out.println("Data terkecil: " + num_max);
        sc.close();
    }
}
