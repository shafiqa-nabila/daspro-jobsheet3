import java.util.Scanner;
/**
 * Listrik21
 */
public class Listrik21 {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            boolean statusListrik;
            int hargaListrik = 1500, jumlahListrik, totalHargaListrik;
    
            System.out.print("Masukkan jumlah penggunaan listrik (kWh)\t\t: ");
            jumlahListrik = sc.nextInt();
    
            statusListrik = jumlahListrik > 500;
    
            totalHargaListrik = jumlahListrik * hargaListrik;
    
            System.out.printf("\nOutput:\n\nApakah Listrik Melebihi 500 kwh?\t: %s\nJumlah Listrik\t\t\t\t: %s\nHarga Listrik (kwh)\t\t\t: %s\nTotal Bayar Listrik\t\t\t: %s", statusListrik, jumlahListrik, hargaListrik, totalHargaListrik);
    }
}