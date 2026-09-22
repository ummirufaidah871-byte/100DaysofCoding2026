import java.util.Scanner;
public class Day21 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String JB = sc.nextLine();
    String Harga = sc.nextLine();
    String uk = sc.nextLine();
    String Jumlah = sc.nextLine();
    String ins = sc.nextLine();
    
    int jumlah = Integer.parseInt(JB);
    int harga = Integer.parseInt(Harga);
    double UK = Double.parseDouble(uk);
    boolean TR = Boolean.parseBoolean(Jumlah);
    char INS = ins.charAt(0);

    System.out.printf("Jumlah Barang : %d%nHarga per Item : %d%nUkuran : %.2fm%nStatus Input : %b%nBlok Antrian : %c%n",jumlah,harga,UK,TR,INS);
    sc.close();

    }
}
