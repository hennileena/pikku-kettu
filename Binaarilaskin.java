import java.util.Scanner;

public class Binaarilaskin {

    public static void main(String[] args) {

        Scanner lukija = new Scanner(System.in);
        System.out.print("Anna ensimmäinen luku: ");
        long ekaLuku = Long.parseLong(lukija.nextLine());
        System.out.print("Anna toinen luku: ");
        long tokaLuku = Long.parseLong(lukija.nextLine());

        long tulos = ekaLuku + tokaLuku;
        System.out.println("Laskutoimitus: " + ekaLuku + " + " + tokaLuku
                            + " = " + tulos);
        System.out.println("Muutetaan binaariluvuiksi...");

        System.out.println(Long.toBinaryString(ekaLuku) + " + "
                            + Long.toBinaryString(tokaLuku) + " = "
                            + Long.toBinaryString(tulos));

    }

}
