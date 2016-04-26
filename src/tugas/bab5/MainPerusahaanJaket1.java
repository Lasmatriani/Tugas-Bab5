
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

        } while (pil != 2);
        System.out.println("=======>>>SELESAI<<<=======");
    }
}
