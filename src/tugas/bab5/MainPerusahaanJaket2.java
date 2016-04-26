
import java.util.Scanner;

public class MainPerusahaanJaket {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PerusahaanJaket jaket = new PerusahaanJaket();
        int pil;
        do {
            System.out.println("=======>>>Perusahaan Jaket<<<========");
            System.out.println("1. Beli Jaket\n2. Keluar");
            System.out.print("Masukkan pilihan anda: ");
            pil = in.nextInt();
            if (pil == 1) {
                System.out.print("Masukkan jumlah jaket A yang ingin di beli: ");
                int jaketA = in.nextInt();
                jaket.totalJaketA(jaketA);
                System.out.print("Masukkan jumlah jaket B yang ingin di beli: ");
                int jaketB = in.nextInt();
                jaket.totalJaketB(jaketB);
                System.out.print("Masukkan jumlah jaket C yang ingin di beli: ");
                int jaketC = in.nextInt();
                jaket.totalJaketC(jaketC);
                System.out.printf("%s%d%s%.0f\n", "Jumlah jaket A yang di pesan adalah ", jaketA, " dengan total harga Rp.", jaket.getTotalA());
                System.out.printf("%s%d%s%.0f\n", "Jumlah jaket B yang di pesan adalah ", jaketB, " dengan total harga Rp.", jaket.getTotalB());
                System.out.printf("%s%d%s%.0f\n", "Jumlah jaket C yang di pesan adalah ", jaketC, " dengan total harga Rp.", jaket.getTotalC());
                System.out.println("-------------------------------------------------------------------------------------");
                System.out.printf("%s%.0f\n", "Dengan total harga seluruh jaket adalah Rp.", PerusahaanJaket.getTotal());
                System.out.println("-------------------------------------------------------------------------------------");
            }
        } while (pil != 2);
        System.out.println("=======>>>SELESAI<<<=======");
    }
}
