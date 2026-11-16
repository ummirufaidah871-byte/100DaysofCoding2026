import java.util.Scanner;
public class Day77 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String a = sc.nextLine(); 
        String b = sc.nextLine(); 
        
        // --- METHOD PENGECEKAN ---
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
        
        // --- METHOD DASAR ---
        System.out.print("Panjang karakter variabel a ");
        System.out.println(a.length());
        
        System.out.print("Variabel a huruf besar semua ");
        System.out.println(a.toUpperCase());
        
        System.out.print("Variabel b huruf kecil semua ");
        System.out.println(b.toLowerCase());
        
        // --- METHOD MANIPULASI ---
        System.out.print("Variabel a setelah trim ");
        System.out.println(a.trim());
        
        System.out.print("Substring variabel a (indeks 0 s.d 3) ");
            System.out.println(a.substring(0, 3));
        
        System.out.print("Variabel a setelah replace kata 'Java' ke 'Python' ");
        System.out.println(a.replace("Java", "Python"));
        
        sc.close();
    }
}
