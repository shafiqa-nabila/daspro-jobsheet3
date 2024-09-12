import java.util.Scanner;
/**
 * Gaji21
 */
public class Gaji21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah jam kerja: ");
        int jumlahJamKerja = sc.nextInt();
        System.out.print("Masukkan upah per jam: ");
        double upahPerJam = sc.nextDouble();

        double totalGajiSebelumPajak = jumlahJamKerja * upahPerJam;
        double bonus = totalGajiSebelumPajak * 0.10;
        double pajakPersentase = 0.05;
        double gajiDanBonusSetelahPajak = (totalGajiSebelumPajak + bonus) * pajakPersentase;

        System.out.println("Total Gaji Sebelum Pajak: Rp " + String.format("%.2f", totalGajiSebelumPajak));
        System.out.println("Bonus: Rp " + String.format("%.2f", bonus));
        System.out.println("Gaji dan Bonus Setelah Pajak: Rp " + String.format("%.2f", (totalGajiSebelumPajak + bonus) - gajiDanBonusSetelahPajak));
    }
}