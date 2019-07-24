package nl.qien.kermis;
import java.util.ArrayList;

public class BelastingInspecteur {
int geindeBelasting;
int totaleOpbrengst;

    public void belastingInnen (Kassa kassa){
        System.out.println("Daar ben ik weer, de belasting meneer (of dame met baard? Op de kermis weet je het nooit zeker). ");
        geindeBelasting = kassa.meeTeGevenBedrag;
        totaleOpbrengst += geindeBelasting;
        System.out.println("Ik heb "+ geindeBelasting + " opgehaald.");
        System.out.println("Het totaal komt neer op "+ totaleOpbrengst+ ".");


    }


}
