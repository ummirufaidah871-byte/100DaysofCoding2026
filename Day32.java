import java.util.Scanner;

public class Day32 {
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        int UTS = sc.nextInt();
        int kehadiran = sc.nextInt();
        int UAS = sc.nextInt();

        if (UTS >= 80 && UAS >75 || (UTS >= 90 && kehadiran ==16 )){
            System.out.println("LULUS");
        } else {
            System.out.println("TIDAK LULUS");
        }
        sc.close();
    }
}
