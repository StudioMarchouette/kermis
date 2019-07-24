package nl.qien.kermis;

public class Spiegelpaleis extends Attractie {


    Spiegelpaleis(){
        naam ="SuperVeelSpiegels";
        prijs = 275;
        oppervlakte = 200;
    }
    @Override
    public void draaien() {
        System.out.println("De spiegels zijn gepoetst, de pleisters liggen klaar. SuperVeelSpiegels is klaar voor de start, een gast stapt in.");
        aantalKaartenVerkocht++;
        omzet = omzet+ prijs;
        System.out.println(naam + " heeft nu "+ aantalKaartenVerkocht+ " kaarten verkocht en een totale omzet geboekt van "+ omzet);



    }
}
