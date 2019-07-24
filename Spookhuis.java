package nl.qien.kermis;

public class Spookhuis extends Attractie {




    Spookhuis(){
        naam ="BOEH";
        prijs = 320;
        oppervlakte = 100;
    }

    @Override
    public void draaien() {
        System.out.println( naam + " maakt zich klaar om mensen te laten schrikken, een gast stapt in.");
        aantalKaartenVerkocht++;
        omzet = omzet+ prijs;
        System.out.println(naam + " heeft nu "+ aantalKaartenVerkocht+ " kaarten verkocht en een totale omzet geboekt van "+ omzet);



    }
}
