import java.util.Scanner;
public class Day55 {
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        int i = sc.nextInt();
        for (; i <=10; i++) {
            if (i == 9) {
                break;
            } 
            if (i == 7) {
                continue;
            }
            System.out.println(i);
        }
        System.out.println("setelah perulangan");

        for (; i <=10; i++) {
            if (i == 9) {
                return ;
            }
            System.out.println(i);
        }
        System.out.println("Kosong");
        sc.close();
    }

}
