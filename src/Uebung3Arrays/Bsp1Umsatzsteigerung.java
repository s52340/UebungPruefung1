package Uebung3Arrays;

public class Bsp1Umsatzsteigerung {
    public static void main(String[] args) {

        double[] jahresUmsatz = {3.3, 30.5, 40.4, 47, 145.3, 198.9,54, 12,113.4, 87.9,10.3,215.5};
        double jaenner = jahresUmsatz[0];
        double februar = jahresUmsatz[1];
        double maerz = jahresUmsatz[3];
        double april = jahresUmsatz[4];
        double mai = jahresUmsatz[5];
        //...
        double dezember = jahresUmsatz[11];

        System.out.println("ICH: " + getUmsatzsteigerungGT10(jahresUmsatz));
        System.out.println("Lehrer: " + getUmsatzsteigerungGT10Lehrer(jahresUmsatz));
    }

    // meines - ist iwie falsch
    public static int getUmsatzsteigerungGT10(double[] umsaetze){
        int count = 0;
        for (int i = 0; i < umsaetze.length -2; i++) {
            double monat = umsaetze[i];
            double nächstesMonat = umsaetze[++i];
            if (monat < nächstesMonat) {
                 if ((umsaetze[i + 1] - umsaetze[i]) / umsaetze[i] * 100 >= 10){
                     count++;
                }
            }
        }
        return count;
    }


    public static int getUmsatzsteigerungGT10Lehrer(double[] umsaetze) {
        int count = 0;
        for (int i = 0; i < umsaetze.length - 1; i++) {

            double vormonat = umsaetze[i];
            double monat = umsaetze[i + 1];

            if (monat > vormonat) {
                if ((monat - vormonat) / vormonat * 100 >= 10) {
                    count++;
                }
            }
        }
        return count;
    }
}
