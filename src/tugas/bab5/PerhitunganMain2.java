
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
            switch (pil) {
                case 1:
                    double penjumlahan = Perhitungan.penjumlahan(a, b);
                    System.out.println("Hasil penjumlahan bilangan pertama dan kedua adalah " + penjumlahan);
                    break;
                case 2:
                    double pengurangan = Perhitungan.pengurangan(a, b);
                    System.out.println("Hasil pengurangan bilangan pertama dan kedua adalah " + pengurangan);
                    break;
                case 3:
                    System.out.println("Hasil perkalian bilangan pertama dan kedua adalah " + baru.perkalian(a, b));
                    break;
                case 4:
                    System.out.println("Hasil pembagian bilangan pertama dan kedua adalah " + baru.pembagian(a, b));
                    break;
                case 5:
                    System.out.println("Jika bilangan pertama adalah pembilang dan bilangan kedua adalah penyebut.\nJika disederhanakan maka hasilnya adalah: ");
                    baru.sederhana(a, b);
                    break;
                case 6:
                    System.exit(0);
                    break;
            }
        } while (pil != 6);
        System.out.println("=======>>>SELESAI<<<=======");
    }
}
