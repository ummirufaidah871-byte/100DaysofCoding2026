import java.util.Scanner;
public class eval2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nilai = sc.nextInt();
        if(nilai >=80){
            System.out.println("A");
        } else if (nilai >=70) {
            System.out.println("B");
        } else if (nilai >=60) {
            System.out.println("C");
        } else {
            System.out.println("D");
        }
sc.close();
    } 
}
