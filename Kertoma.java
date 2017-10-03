import java.util.Scanner;

public class Kertoma {

    public static void main(String[] args) {
        long annettuLuku;
        long tulos = 1;

        Scanner lukija = new Scanner(System.in);
        System.out.println("Anna luku: ");
        annettuLuku = Long.parseLong(lukija.nextLine());

        for (int i = 1; i <=annettuLuku ; i++) {
            tulos *= i;
        }
        System.out.println("Luvun " +annettuLuku+ " kertoma on: " + tulos);
    }
}




