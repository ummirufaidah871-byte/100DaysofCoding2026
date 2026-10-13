import java.util.Scanner;
public class Day44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Nilai = sc.nextInt();
        if (Nilai >=90){
            System.out.println("Predikat nilai: A");
        }else if (Nilai >=80){
            System.out.println("Predikat nilai : B");
        }else if (Nilai >=70){
            System.out.println("Predikat nilai : C");
        }else if (Nilai >=60) {
            System.out.println("Predikat nilai : D");
        }else {
            System.out.println("Predikat nilai : E");
        }
        sc.close();
    }
}
