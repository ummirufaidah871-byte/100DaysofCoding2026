import java.util.Scanner;
public class Day27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = ++a;
        int c = a++;
        int d = --a;
        int e = a--;
        System.out.println("increment prefix :" + b);
        System.out.println("increment postfix :" + c);
        System.out.println("Decrement prefix :" + d);
        System.out.println("Decrement postfix :" + e);
        sc.close();
    }
}
