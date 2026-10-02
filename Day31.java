import java.util.Scanner;

public class Day31 {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int UAS = sc.nextInt();
    int UTS = sc.nextInt();
    if (UAS >=80 && UTS >=75){
        System.out.println("LULUS");
    }else {
        System.out.println("TIDAK LULUS");
    } 
    int tinggi = sc.nextInt();
    int umur = sc.nextInt();
    if (tinggi >=160 || umur>=17){
        System.out.println("LULUS");
    }else {
        System.out.println("TIDAK LULUS");
    } 
int nilai = sc.nextInt();
boolean lulus = nilai >= 70;
if (!lulus) {
    System.out.println("Belum lulus");
} 
sc.close();
   } 
}
