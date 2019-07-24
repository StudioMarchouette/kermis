package nl.qien.kermis;

public class Botsauto extends Attractie {





    public Botsauto(){
        naam ="BOTS!";
        prijs = 250;
        oppervlakte= 80;
    }
   @Override
    public void draaien() {
        System.out.println("De "+ naam + "  staan klaar om pijnlijke momenten te veroorzaken. De muziek staat echt veel te hard, een gast stapt in.");
        aantalKaartenVerkocht++;
        omzet += prijs;
        System.out.println( naam + " heeft nu "+ aantalKaartenVerkocht+ " kaarten verkocht en een totale omzet geboekt van "+ omzet);



    }
}
