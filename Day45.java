import java.util.Scanner;
public class Day45 {
    public static void main(String[] args) {
        Scanner sc= new  Scanner(System.in);
        System.out.println( "rangking: ");
        int rangking = sc.nextInt();
        switch (rangking) {
            case 1,2,3,4,5 -> System.out.println("LULUS");
            default -> System.out.println("TIDAK LULUS");
        }
        sc.close();
    }
}
