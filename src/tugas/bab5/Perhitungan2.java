
public class Perhitungan {

    public static double penjumlahan(double a, double b) {
        double c = a + b;
        return c;
    }

    public static double pengurangan(double a, double b) {
        double c = a - b;
        return c;
    }

    public double perkalian(double a, double b) {
        double c = a * b;
        return c;
    }

    public double pembagian(double a, double b) {
        double c = a / b;
        return c;
    }

    public void sederhana(double pembilang, double penyebut) {
        int tmp = 1;
        System.out.println("Nilai pecahan sebelum disederhanakan " + (int) pembilang + "/" + (int) penyebut);
        for (int i = 2; i <= pembilang; i++) {
            if ((int) pembilang % i == 0 && (int) penyebut % i == 0) {
                tmp = i;
            }
        }
        System.out.println("Nilai pecahan setelah disederhanakan " + (int) (pembilang / tmp) + "/" + (int) (penyebut / tmp));
    }
}
