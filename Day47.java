import java.util.Scanner;
public class Day74 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hari = sc.nextInt();
        switch (hari) {
            case 1 ->
            System.out.println("Senin");
            case 2 ->
            System.out.println("Selasa");
            case 3 ->
            System.out.println("Rabu");
            case 4 ->
            System.out.println("Kamis");
            case 5 ->
            System.out.println("Jumat");
            case 6 ->
            System.out.println("Sabtu");
            case 7 ->
            System.out.println("Minggu");
            default->
                System.out.println("Hari tidak valid");
        }
        sc.close();
    }
}
