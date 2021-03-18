import java.util.Scanner;

public class TugasG {
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    
    Double galon, total;
    System.out.println("Konversi Galon ke Liter");
    System.out.println("\nMasukan Jumlah Galon :"); 
    galon = scan.nextDouble();
    total = galon * 3.785;
    System.out.println("\nTOTAL ke Liter");
    System.out.printf("%.0f Galon = %.3f Liter \n\n ", galon, total);
    }
    
}
