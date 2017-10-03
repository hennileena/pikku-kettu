import java.util.Random;
import java.util.Scanner;

public class Arvauspeli {

    public static void main(String[] args) {

        int arvaustenMaara = 1;

        Random luvunArpoja = new Random();
        int oikeaLuku = luvunArpoja.nextInt(10);

        System.out.println("Arvaa luku: ");

        Scanner lukija = new Scanner(System.in);
        int arvattuLuku = Integer.parseInt(lukija.nextLine());

        if (arvattuLuku == oikeaLuku) {
            System.out.println("Oikein arvattu! Arvasit " +arvaustenMaara +" kerran.");
        } else {
            while (arvattuLuku != oikeaLuku) {
                arvaustenMaara++;
                System.out.println("Väärin. Arvaa uudelleen: ");
                if (arvattuLuku < oikeaLuku) {
                    System.out.println("Oikea luku on suurempi.");
                } else {
                    System.out.println("Oikea luku on pienempi.");
                }
                arvattuLuku = Integer.parseInt(lukija.nextLine());
            }
            System.out.println("Oikein arvattu, arvasit " + arvaustenMaara + " kertaa!");
        }
    }
}