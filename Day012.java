import java.util.Scanner;
public class Day12 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Nama: ");
        String nama = input.nextLine();

        System.out.print("NIM: ");
        String NIM = input.nextLine();

        System.out.print("Program Studi: ");
        String prodi = input.nextLine();

        System.out.print("Fakultas: ");
        String Fakultas = input.nextLine();     

        System.out.print("Tanggal Lahir: ");
        int TanggalLahir = input.nextInt();
        input.nextLine();

        System.out.print("Tempat Lahir: ");
        String TempatLahir = input.nextLine();

        System.out.print("Jenis Kelamin: ");
        char Jenis = input.next().charAt(0);
        
        System.out.print("No. HP: ");
        long NoHp = input.nextLong();

        System.out.print("Tinggi Badan: ");
        double Tinggi = input.nextDouble();
        input.nextLine();

        System.out.print("Alamat: ");
        String alamat = input.nextLine();

System.out.println("======BIODATA DIRI SEDERHANA======");
System.out.printf("%-15s : %s%n", "Nama", nama);
System.out.printf("%-15s : %s%n", "NIM", NIM);
System.out.printf("%-15s : %s%n", "Prodi", prodi);
System.out.printf("%-15s : %s%n", "Fakultas", Fakultas);
System.out.printf("%-15s : %d%n", "Tanggal Lahir", TanggalLahir);
System.out.printf("%-15s : %s%n", "Tempat Lahir", TempatLahir);
System.out.printf("%-15s : %c%n", "Jenis Kelamin", Jenis);
System.out.printf("%-15s : %d%n", "No. HP", NoHp);
System.out.printf("%-15s : %.1fcm%n", "Tinggi", Tinggi);
System.out.printf("%-15s : %s%n", "Alamat", alamat);
input.close();
    }
}
