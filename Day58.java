import java.util.Scanner;
public class Day58 {
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        int a = sc.nextInt();
        System.out.print("BIlangan Genap: ");
        for (int i = a; i >=1; i--) {
            if (i %  2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println(" ");
        System.out.print("Bilangan Ganjil: ");
        for (int i = a; i >=1; i--) {
            if (i %  2 != 0) {
                System.out.print(i + " ");
            } 
        }
        sc.close();
    }
}


