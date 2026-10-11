import java.util.Scanner;
public class Day42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Gaji Pokok: ");
        double gaji = sc.nextInt();

        double TER;
        if (gaji <=5400000){
            TER = 0;
        }else if (gaji >=5500000){
            TER = 0.25;
        }else if (gaji >=60000000){
            TER = 0.75;
        }else if (gaji >=7000000){
            TER = 1.25;
        }else if (gaji >=8000000){
            TER = 1.50;
        }else if (gaji >=10000000){
            TER = 2.00;
        }else if (gaji >=15000000){
            TER = 6.00;
        } else{
            TER = 10.00;
        }
        double pajak = gaji * (TER / 100);
        double GajiBersih = gaji - pajak;
        System.out.println("====RINCIAN GAJI====");
        System.out.printf("Gaji kotor: %,.0f%nPajak TER: %,.0f%nGAji bersih: %,.0f",gaji,pajak,GajiBersih);
        sc.close();
    }
}
