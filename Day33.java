public class Day33 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int nilai = sc.nextInt();
    int kehadiran = sc.nextInt();

    if (nilai >=80 && kehadiran == 16){
        System.out.println("Anda LULUS");
    } else {
        System.out.println("Anda TIDAK LULUS");
    }
    sc.close();
}
}
