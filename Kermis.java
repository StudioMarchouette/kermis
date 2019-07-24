package nl.qien.kermis;

import java.util.ArrayList;
import java.util.Scanner;

public class Kermis {
    Scanner sc = new Scanner(System.in);

    Kassa kassa = new Kassa();
    BelastingInspecteur bebaardeDame = new BelastingInspecteur();


    public ArrayList<Attractie> attractieLijst = new ArrayList<>();

    Attractie botsauto = new Botsauto();
    Attractie polyp = new SuperPolyp();
    Attractie spiegelpaleis = new Spiegelpaleis();
    Attractie spookhuis = new Spookhuis();
    Attractie hawaii = new Hawaii();
    Attractie ladderklimmen = new Ladderklimmen();

    static int stop = 0;
    int keuzeAttractie;


    public void maakLijst() {


        attractieLijst.add(botsauto);
        attractieLijst.add(polyp);
        attractieLijst.add(spiegelpaleis);
        attractieLijst.add(spookhuis);
        attractieLijst.add(hawaii);
        attractieLijst.add(ladderklimmen);
    }





    void kermisAanZetten() {


        System.out.println("***De Kermis***");


        do {
            System.out.println("Druk op een getal om een keuze te maken: ");
            System.out.println("1 = Botsauto's laten draaien");
            System.out.println("2 = Superpolyp laten draaien");
            System.out.println("3 = Hawaii laten draaien");
            System.out.println("4 = Spiegelpaleis laten draaien");
            System.out.println("5 = Spookhuis laten draaien");
            System.out.println("6 = Ladderklimmen laten draaien");
            System.out.println("7 = Kassasysteem: belasting, omzet en kaartverkoop");
            System.out.println("0 = Exit menu");
            keuzeAttractie = sc.nextInt();

            hoofdMenu();


        }
        while (keuzeAttractie != stop);
        System.out.println("Het kermis programma is nu gestopt.");


    }

    public void hoofdMenu() {
        switch (keuzeAttractie) {
            case 1:
                botsauto.draaien();
                break;
            case 2:
                polyp.draaien();
                break;
            case 3:
                hawaii.draaien();
                break;
            case 4:
                spiegelpaleis.draaien();
                break;
            case 5:
                spookhuis.draaien();
                break;
            case 6:
                ladderklimmen.draaien();
                break;
            case 7:
                kassa.openKassaSysteem(kassa, attractieLijst, bebaardeDame);
                break;
            case 0:
                System.out.println("Het kermis programma gaat stoppen");
                keuzeAttractie = 0;
                break;
            default:
                System.out.println("Deze invoer is niet geldig, kies opnieuw");
                break;
        }
    }


}
