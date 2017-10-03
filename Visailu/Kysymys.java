package Visailu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Kysymys {

 /*   private String kysymysteksti;
    private List<String> kysymyslista;
    private List<String> vastausvaihtoehdot;
    private int oikeanVastauksenIndeksi;


    public Kysymys(String kysymysteksti, List<String> vastausvaihtoehdot, int oikeanVastauksenIndeksi) {
        this.kysymysteksti = kysymysteksti;
        vastausvaihtoehdot = vastausvaihtoehdot;
        this.oikeanVastauksenIndeksi = oikeanVastauksenIndeksi;
    }

    List<String> vastausvaihtoehdot1 = new ArrayList<>();
    Kysymys kysymys1 = new Kysymys("Missä maassa Academylla ei ole toimintaa?", vastausvaihtoehdot1, 0);
        vastausvaihtoehdot1.add("A");
        vastausvaihtoehdot1.add("B");
        vastausvaihtoehdot1.add("C");

    List<String> vastausvaihtoehdot2 = new ArrayList<>();
    Kysymys kysymys2 = new Kysymys("Monta iitä on Sirin nimessä?", vastausvaihtoehdot2, 2);
        vastausvaihtoehdot2.add("A");
        vastausvaihtoehdot2.add("B");
        vastausvaihtoehdot2.add("C");

    List<String> vastausvaihtoehdot3 = new ArrayList<>();
    Kysymys kysymys3 = new Kysymys("Monta konsulttia on Acedemylla Suomessa?", vastausvaihtoehdot3, 0);
        vastausvaihtoehdot3.add("A");
        vastausvaihtoehdot3.add("B");
        vastausvaihtoehdot3.add("C");

    List<String> vastausvaihtoehdot4 = new ArrayList<>();
    Kysymys kysymys4 = new Kysymys("Mikä on Samun sukunimi?", vastausvaihtoehdot4, 1);
        vastausvaihtoehdot4.add("A");
        vastausvaihtoehdot4.add("B");
        vastausvaihtoehdot4.add("C");

    List<String> vastausvaihtoehdot5 = new ArrayList<>();
    Kysymys kysymys5 = new Kysymys("Milloin Academyn konsultit valmistuvat?", vastausvaihtoehdot5, 1);
        vastausvaihtoehdot5.add("A");
        vastausvaihtoehdot5.add("B");
        vastausvaihtoehdot5.add("C");

    List<String> vastausvaihtoehdot6 = new ArrayList<>();
    Kysymys kysymys6 = new Kysymys("Monta viikkoa Academy kestää?", vastausvaihtoehdot6, 2);
        vastausvaihtoehdot6.add("A");
        vastausvaihtoehdot6.add("B");
        vastausvaihtoehdot6.add("C");

    List<String> vastausvaihtoehdot7 = new ArrayList<>();
    Kysymys kysymys7 = new Kysymys("Mitä Academyssa opitaan?", vastausvaihtoehdot7, 0);
        vastausvaihtoehdot7.add("A");
        vastausvaihtoehdot7.add("B");
        vastausvaihtoehdot7.add("C");

    List<String> vastausvaihtoehdot8 = new ArrayList<>();
    Kysymys kysymys8 = new Kysymys("Missä Academyn tilat sijaitsevat?", vastausvaihtoehdot8, 1);
        vastausvaihtoehdot8.add("A");
        vastausvaihtoehdot8.add("B");
        vastausvaihtoehdot8.add("C");

    List<String> vastausvaihtoehdot9 = new ArrayList<>();
    Kysymys kysymys9 = new Kysymys("Mitä?", vastausvaihtoehdot9, 0);
        vastausvaihtoehdot9.add("A");
        vastausvaihtoehdot9.add("B");
        vastausvaihtoehdot9.add("C");

    List<String> vastausvaihtoehdot10 = new ArrayList<>();
    Kysymys kysymys10 = new Kysymys("Monta?", vastausvaihtoehdot10, 1);
        vastausvaihtoehdot10.add("A");
        vastausvaihtoehdot10.add("B");
        vastausvaihtoehdot10.add("C");

    List<String> vastausvaihtoehdot11 = new ArrayList<>();
    Kysymys kysymys11 = new Kysymys("Missä?", vastausvaihtoehdot11, 2);
        vastausvaihtoehdot11.add("A");
        vastausvaihtoehdot11.add("B");
        vastausvaihtoehdot11.add("C");


    List<Kysymys> kysymyslista = new ArrayList<>();
        kysymyslista.add(kysymys1);
        kysymyslista.add(kysymys2);
        kysymyslista.add(kysymys3);
        kysymyslista.add(kysymys4);
        kysymyslista.add(kysymys5);
        kysymyslista.add(kysymys6);
        kysymyslista.add(kysymys7);
        kysymyslista.add(kysymys8);
        kysymyslista.add(kysymys9);
        kysymyslista.add(kysymys10);
        kysymyslista.add(kysymys11);

    public void sekoitus() {
        Collections.shuffle();
    }
    /* public void heitaKysymys() {
        Random kysymyksenheittaja = new Random();
        int index = kysymyksenheittaja.nextInt(kysymyslista.size());
        String kysymysteksti = kysymyslista.get(index);
        System.out.println(kysymysteksti);
    }


    @Override
    public String toString() {
        return kysymysteksti + '\'' +
                vastausvaihtoehdot +
                oikeanVastauksenIndeksi +
                '}';
    } */

}

