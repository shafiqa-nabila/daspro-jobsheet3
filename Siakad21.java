import java.util.Scanner;

/**
 * Siakad21
 */
public class Siakad21 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nama, nim;
        char kelas;
        byte absen;
        double nilaiKuis, nilaiTugas, nilaiUTS, nilaiUAS, nilaiAkhir;

        System.out.print("Masukkan nama\t\t: ");
        nama = sc.nextLine();
        System.out.print("Masukkan nim\t\t: ");
        nim = sc.nextLine();
        System.out.print("Masukkan kelas\t\t: ");
        kelas = sc.nextLine().charAt(0);
        System.out.print("Masukkan nomor absen\t: ");
        absen = sc.nextByte();
        System.out.print("Masukkan nilai kuis\t: ");
        nilaiKuis = sc.nextDouble();
        System.out.print("Masukkan nilai tugas\t: ");
        nilaiTugas = sc.nextDouble();
        System.out.print("Masukkan nilai UTS\t: ");
        nilaiUTS = sc.nextDouble();
        System.out.print("Masukkan nilai UAS\t: ");
        nilaiUAS = sc.nextDouble();

        nilaiAkhir = (nilaiKuis / 100 * 20) + (nilaiTugas / 100 * 15) + (nilaiUTS / 100 * 30) + (nilaiUAS / 100 * 35);

        System.out.printf("Output:\nNama\t: %s\nNIM\t: %s\nKelas\t: %s\nAbsen\t: %s\nNilai Akhir\t: %s", nama, nim, kelas, absen, nilaiAkhir);
    }
}