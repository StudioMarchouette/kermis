package nl.qien.kermis;

public class Ladderklimmen extends Attractie implements GokAttractie{


    Ladderklimmen() {
        naam = "GeldLadder";
        prijs = 500;
        oppervlakte = 10;


    }

    @Override
    public void draaien() {
        System.out.println("De ladder hangt er weer wankeltjes bij, klaar om geld te verdienen. Een gast waagt een poging.");
        aantalKaartenVerkocht++;
        belasting += kansSpelBelastingBetalen();
        omzet = omzet+ (prijs- kansSpelBelastingBetalen());
        System.out.println(naam + " heeft nu "+ aantalKaartenVerkocht+ " kaarten verkocht en een totale omzet geboekt van "+ omzet);
        System.out.println("Er is in totaal "+ belasting + " aan kans spel belasting gereserveerd.");


    }
    public int kansSpelBelastingBetalen(){
        return prijs / 100 * 30;

    }

}
