
public class PerusahaanJaket {

    private static final double jaketA = 100000, jaketB = 125000, jaketC = 175000;
    private static double totalsemua;
    private double totalA, totalB, totalC;
    private int jumA, jumB, jumC;

    public void totalJaketA(int jum) {
        this.jumA = jum;
        if (jum >= 100) {
            totalA = (jaketA - 5000) * jum;
        } else {
            totalA = jaketA * jum;
        }
        totalsemua += totalA;
    }

    public void totalJaketB(int jum) {
        this.jumB = jum;
        if (jum >= 100) {
            totalB = (jaketB - 5000) * jum;
        } else {
            totalB = jaketB * jum;
        }
        totalsemua += totalB;
    }
}
