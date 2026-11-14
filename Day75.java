import java.util.Scanner;
public class Day75 {
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        String a = sc.nextLine(); 
        String b = sc.nextLine(); 
        System.out.print("Variabel a identik dengan variabel b ");
        System.out.println(a.equals(b));
        System.out.print("Karakter variabel a sama dengan variabel b ");
        System.out.println(a.equalsIgnoreCase(b));
        System.out.print("Variabel a berisi kata (Nama) ");
        System.out.println(a.contains("Nama"));
        System.out.print("Variabel b berisi kata (Nama) ");
        System.out.println(b.contains("Nama"));
        System.out.print("Variabel a kosong ");
        System.out.println(a.isEmpty());
        System.out.print("Variabel b kosong ");
        System.out.println(b.isEmpty());
        sc.close();
    }
}
