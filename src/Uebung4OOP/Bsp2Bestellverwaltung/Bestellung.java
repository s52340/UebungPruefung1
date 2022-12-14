package Uebung4OOP.Bsp2Bestellverwaltung;

public class Bestellung {
    private String nummer;
    private Bestellzeile[] bZeilen;


    public Bestellung(String nummer, Bestellzeile[] bZeilen) {
        this.nummer = nummer;
        this.bZeilen = bZeilen;
    }

    public String getNummer() {
        return nummer;
    }

    public Bestellzeile[] getbZeilen() {
        return bZeilen;
    }

    public void printBestellung(){
        System.out.print("Ihre Bestellnummer: " + nummer);
        for (int i = 0; i < bZeilen.length; i++) {
            System.out.print(bZeilen[i].getName() + " Preis für 1 Stück: " + bZeilen[i].getPreis() +
                    "Preis für die bestellte Menge: " + bZeilen[i].getMenge() + " = " +
                    bZeilen[i].getKosten() + "Euro ");
        }
    }

    public double getGesammtKosten(){
        double gesammtKosten = 0;
        for (int i = 0; i < bZeilen.length; i++) {
            gesammtKosten = gesammtKosten + bZeilen[i].getKosten();
        }
        return gesammtKosten;
    }
}
