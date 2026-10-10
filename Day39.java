import java.util.Scanner;
public class Day39 {
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        System.out.println("====KALKULATOR SEDERHANA====");
        System.out.print("angka 1: ");
        int angka1 = sc.nextInt();
        System.out.print("operator: ");
        char operator = sc.next().charAt(0);
        System.out.print("angka 2: ");
        int angka2 = sc.nextInt();
        
        if (operator == '+'){
            System.out.println(angka1+angka2);
        }else if (operator == '-'){
            System.out.println(angka1-angka2);
        }else if (operator == '*'){
            System.out.println(angka1*angka2);
        }else if (operator == '/'){
            System.out.println(angka1/angka2);
        }else if (operator =='%'){
            System.out.println(angka1%angka2);
        }else{
            System.out.println("Operator tidak valid");
        }
        System.out.println("============================");
    }
}
