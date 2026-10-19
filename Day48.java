import java.util.Scanner;
public class Day48 {
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        int angka1 = sc.nextInt();
        char op = sc.next().charAt(0);
        int angka2 = sc.nextInt();
        switch (op) {
            case ('+') -> 
            System.out.println("Hasil = "+(angka1+angka2));
            case ('-') -> 
            System.out.println("Hasil = "+ (angka1-angka2));
            case ('*') -> 
            System.out.println("Hasil = "+(angka1*angka2));
            case ('/') -> 
            System.out.println("Hasil = "+(angka1/angka2));
            default -> 
            System.out.println("Operator tidak valid");
        }
        sc.close();
    }
}
