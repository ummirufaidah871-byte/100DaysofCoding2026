import java.util.Scanner;
public class Day63 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int hasil = 1;
        for (int i = 1; i <=n; i++) {
            hasil *=m;
        }
        System.out.println(m + " pangkat " + n +" = " + hasil);
    sc.close();
    }
}
