import java.util.Scanner;
/**
 * RumusBalok
 */
public class RumusBalok {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int panjang, lebar, tinggi;
        int volume;
        int luasPermukaan;

        System.out.print("Masukkan panjang balok: ");
        panjang = sc.nextInt();
        System.out.print("Masukkan lebar balok: ");
        lebar = sc.nextInt();
        System.out.print("Masukkan tinggi balok: ");
        tinggi = sc.nextInt();

        volume = panjang*lebar*tinggi;
        luasPermukaan = 2 * ((panjang*lebar) + (panjang*tinggi) + (lebar*tinggi));

        System.out.println("Volume Balok = " + volume);
        System.out.println("Luas Permukaan = " + luasPermukaan);
        sc.close();
        
    }
}