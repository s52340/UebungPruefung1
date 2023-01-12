package Uebung13Vererbung1.BspLand;

import java.util.ArrayList;

public class Bundesstaat extends Land{
    private ArrayList<Land> laender = new ArrayList<>();


    public Bundesstaat() {
                                  // weglöschen!!! this.laender = laender; - weil es das gleiche ist - macht nichts! Zeile ist umsunst!
    }


    public void addLand(Land l){
        laender.add(l);
    }

    @Override
    public double getBruttoSozialProdukt() {
       double hilfsvar = 0;
        for (Land l: laender) {
            hilfsvar = hilfsvar + l.getBruttoSozialProdukt();
        }
        return hilfsvar;
    }



}
