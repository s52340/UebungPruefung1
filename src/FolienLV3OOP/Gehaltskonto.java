package FolienLV3OOP;

public class Gehaltskonto {
    private String inhaber;
    private String iban;
    private String bic;
    private double kontostand;

    // Erweiterung:
    private int fortlaufendeNummer;    //(=gehaltsKontoID oder ID - eines der beiden)
    public static int counter = 9876;   // (=gehaltsKontoID oder ID - das andere der beiden)

    //public Gehaltskonto(String inhaber, String iban, String bic, double kontostand) - double kontostand weglöschen weil
    // er auf 0.0 gesetzt wird weiter unten! (werte die eingegeben werden, werden auf 0.0 gesetzt!)
    public Gehaltskonto(String inhaber, String iban, String bic) {
        this.inhaber = inhaber;
        this.iban = iban;
        this.bic = bic;
        this.kontostand = 0.0;
        this.counter ++;
        this.fortlaufendeNummer = counter;
    }

    public void aufbuchen(double wert){
        if (wert > 0){
        kontostand = kontostand + wert;
        }
        else {
            System.out.println("Wert muss immer positiv sein" + wert);
        }
    }

    public void abbuchen(double wert){
        if (wert > 0) {
            if ((kontostand - wert) > 0) {
                kontostand = kontostand - wert;
            } else {
                System.out.println("Abbuchung nicht möglich! Wert: " +wert+ " - übersteigt Kontostand: " + kontostand);
            }
        }
        else {
            System.out.println("Wert muss immer positiv sein");
        }
    }

    public double getKontostand() {
        return kontostand;
    }

    public String toStringInhaberKontostand() {
        return "Gehaltskonto{" +
                "inhaber='" + inhaber + '\'' +
                ", kontostand=" + kontostand +
                '}';
    }


    // nicht nötig lt. Angabe - ich versuche dinge :)
    public String toStringInhaber() {
        return "Gehaltskonto{" +
                "inhaber='" + inhaber + '\'' +
                '}';
    }

    public String getInhaber() {
        return inhaber;
    }


    @Override
    public String toString() {
        return "Gehaltskonto{" +
                " fortlaufendeNummer='" + fortlaufendeNummer + '\'' +
                ", counter='" + counter + '\'' +
                ", inhaber='" + inhaber + '\'' +
                ", iban='" + iban + '\'' +
                ", bic='" + bic + '\'' +
                ", kontostand=" + kontostand +
                '}';
    }
}
