import java.util.Scanner;
public class Day83 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int [] array = new int[a];
        int total = 0;
        for (int i = 0; i < array.length; i++) {
            array [i]= sc.nextInt();
            total += array[i];
        }
        System.out.println("Jumlah data: "+total);
        sc.close();
    }
}
