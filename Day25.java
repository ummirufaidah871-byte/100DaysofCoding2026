import java.util.Scanner;
public class Day25 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in); 
        int nilai1 = sc.nextInt();
        double hasil = Math.PI*nilai1*nilai1;
System.out.printf("Keliling Lingkaran : %.2f", hasil);
        sc.close();
    }
}
