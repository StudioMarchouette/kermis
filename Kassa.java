package nl.qien.kermis;

import java.util.ArrayList;
import java.util.Scanner;


public class Kassa {
    int omzetKermisTotaal;
    int totaleKaartverkoop;
    int totaleBelasting;
    int meeTeGevenBedrag;
    Scanner sc = new Scanner (System.in);




    public void toonOmzetKermis(ArrayList<Attractie> attractieLijst) {
        for (Attractie a : attractieLijst) {
            omzetKermisTotaal += a.omzet;
            System.out.println();
            System.out.println("Omzet van " + a.naam + " is " + a.omzet);
            System.out.println("De totale omzet van de Kermis is: " + omzetKermisTotaal);
        }

    }

    public void toonTotaleKaartverkoop (ArrayList<Attractie>attractieLijst){
        for (Attractie a : attractieLijst){
            totaleKaartverkoop += a.aantalKaartenVerkocht;
            System.out.println();
            System.out.println("Kaartverkoop van de "+ a.naam + " is " + a.aantalKaartenVerkocht);
            System.out.println("De totale kaartverkoop van de kermis is: "+ totaleKaartverkoop);
        }

    }

    public void toonTotaleBelasting (ArrayList<Attractie>attractieLijst){
        for (Attractie a: attractieLijst){
            if ( a instanceof GokAttractie) {
                totaleBelasting += a.belasting;
                System.out.println();
                System.out.println("Er is in totaal " + totaleBelasting + "  gereserveerd uit de kaartverkoop van GokAttracties.");

            }
        }
    }

    public void openKassaSysteem (Kassa kassa, ArrayList<Attractie>attractieLijst, BelastingInspecteur bebaardeDame){
        System.out.println("Kassasysteem wordt geopend.");
        System.out.println("Kies b voor gereserveerde belasting en bezoek inspecteur,  k voor kaartverkoop en o voor omzet");
        char kassaknop = sc.next().charAt(0);

        if (kassaknop== 'k'){
            kassa.toonTotaleKaartverkoop(attractieLijst);
        }
        else if (kassaknop== 'o'){
            kassa.toonOmzetKermis(attractieLijst);
        }else if (kassaknop == 'b'){
            kassa.toonTotaleBelasting(attractieLijst);
            kassa.belastingBetalen();
            bebaardeDame.belastingInnen(kassa);

        }
        else {
            System.out.println("Dit is geen geldige keuze. U wordt teruggestuurd naar het hoofdmenu.");}
    }



    private int belastingBetalen() {
        System.out.println("Het geld wordt opgehaald door de belastinginspecteur");

        meeTeGevenBedrag = totaleBelasting;
        totaleBelasting = totaleBelasting - meeTeGevenBedrag;


        return meeTeGevenBedrag;
    }
}