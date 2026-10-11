import java.util.Scanner;
public class Day41 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("====TEMPERATUR RRUANGAN====");
    System.out.print("Temperatur Suhu: ");
    int suhu = sc.nextInt();
    String Status = "";

    if (suhu >29){
         Status = "Panas";
    } else if (suhu >=24){
         Status = "Normal";
    } else if (suhu >=18){
         Status = "Sejuk";
    } else {
         Status = "Dingin";
    }
    System.out.printf("Suhu Ruangan: %d%nStatus: %s",suhu, Status);
    sc.close();
}
    
}
