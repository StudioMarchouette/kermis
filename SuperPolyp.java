package nl.qien.kermis;

public class SuperPolyp extends RisicoRijkeAttractie {


    SuperPolyp() {
        naam = "TURBO TURBO";
        prijs = 225;
        oppervlakte = 50;
    }

    @Override
    public void draaien() {
        opstellingsKeuring();
        checkOnderhoudsBeurt();
        System.out.println("TURBOTURBO, de polyp strekt zijn tentakels, een gast stapt in.");
        aantalKaartenVerkocht++;
        omzet = omzet + prijs;
        System.out.println(naam + " heeft nu " + aantalKaartenVerkocht + " kaarten verkocht en een totale omzet geboekt van " + omzet);


    }

    @Override
    public void opstellingsKeuring() {
        if (aantalKaartenVerkocht == 0) {
            System.out.println("De " + naam + " wordt gekeurd voor het eerste gebruik in verband met de mogelijke risico's. Veiligheid voor alles! ");
            System.out.println("De monteur heeft de " + naam + " gekeurd, klaar om te zwieren! ");
        }

    }
    public void checkOnderhoudsBeurt(){
        if (aantalKaartenVerkocht % 5 ==0 && aantalKaartenVerkocht!= 0){
            System.out.println("De "+ naam + " is toe aan een onderhoudsbeurt. De monteur gaat deze meteen uitvoeren.");
    }
}
}
