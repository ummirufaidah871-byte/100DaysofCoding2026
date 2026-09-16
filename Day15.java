import java.util.Scanner;
public class Day15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int angka1 = sc.nextInt();
        int angka2 = sc.nextInt();

            System.out.println("Hasil perkalian =" + angka1*angka2);
            if (angka2 != 0) {
                System.out.println("Hasil pembagian = " + angka1 / angka2 );
            } else {
                System.out.println( "tidak dapat dibagi nol");
            }
    sc.close(); 
    }
}
