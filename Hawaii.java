package nl.qien.kermis;

public class Hawaii extends RisicoRijkeAttractie {



    Hawaii(){
        naam ="Maui 2000";
        prijs = 290;
        oppervlakte = 70;
    }

    @Override
    public void draaien() {
        opstellingsKeuring();
        checkOnderhoudsBeurt();
        System.out.println("De "+ naam + " is aan, klaar om te zwieren en zwaaien, een gast stapt in.");
        aantalKaartenVerkocht++;
        omzet = omzet+ prijs;
        System.out.println( naam + " heeft nu "+ aantalKaartenVerkocht+ " kaarten verkocht en een totale omzet geboekt van "+ omzet);



    }
@Override
    public void opstellingsKeuring() {
        if (aantalKaartenVerkocht==0){
            System.out.println("De "+ naam +  " wordt gekeurd voor het eerste gebruik in verband met de mogelijke risico's, je zou er maar uit vliegen! ");
            System.out.println("De monteur heeft de " + naam + " gekeurd, klaar om te zwieren! ");
        }
    }

    public void checkOnderhoudsBeurt(){
        if (aantalKaartenVerkocht % 10 ==0 && aantalKaartenVerkocht !=0 ){
            System.out.println("De "+ naam + " is toe aan een onderhoudsbeurt. De monteur gaat deze meteen uitvoeren.");
        }
    }

}
