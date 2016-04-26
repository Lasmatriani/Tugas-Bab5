
import java.util.Scanner;

public class PerhitunganMain {

    public static void main(String[] args) {
        int pil;
        Perhitungan baru = new Perhitungan();
        Scanner in = new Scanner(System.in);
        do {
            System.out.println("=======>>>ARITMATIKA<<<=======");
            System.out.println("1. Penjumlahan\n2. Pengurangan\n3. Perkalian\n4. Pembagian\n5. Penyederhanaan Pecahan\n6. Keluar");
            System.out.print("Masukkan pilihan anda: ");
            pil = in.nextInt();
            System.out.print("Masukkan Bilangan Pertama: ");
            double a = in.nextInt();
            System.out.print("Masukkan Bilangan Kedua: ");
            double b = in.nextInt();

        } while (pil != 6);
        System.out.println("=======>>>SELESAI<<<=======");
    }
}
