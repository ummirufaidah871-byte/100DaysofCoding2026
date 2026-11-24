import java.util.Arrays;
import java.util.Scanner;
public class Day84 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int angka = sc.nextInt();
        int [] array = new int[angka];
        for (int i = 0; i < array.length; i++) {
            array [i] = sc.nextInt();
        }
        int num_max = Arrays.stream(array).max().orElse(0);
        System.out.println("Data terbesar: " + num_max);
        sc.close();
    }
}
