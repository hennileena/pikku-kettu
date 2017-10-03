import java.lang.Math;

public class Lukutaulu {

    public static void main(String[] args) {

        double [] taulukko = new double [100];

        for (int i = 0; i<100; i++) {
            double luku = (Math.random() *1000);
            taulukko[i] = luku;
        }
        double pienin = 0;
        double suurin = 0;
        double summa = 0;
        double keskiarvo = 0;

        System.out.println("Statistiikkaa luvuista:" );
        System.out.println('\t' + "pienin: "+ pienin);
        System.out.println('\t' + "suurin: "+ suurin);
        System.out.println('\t' + "summa: " + summa);
        System.out.println('\t' + "keskiarvo: "+ keskiarvo);
    }
}


