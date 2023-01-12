package Uebung13Vererbung1.BspKonto;

public class GiroKonto extends Konto {

    private double limit;


    public GiroKonto(String inhaber, double limit) {
        super(inhaber);
        this.limit = limit;
    }


    public void einzahlen(double wert) {
        super.einzahlen(wert);
    }

    @Override
    public void auszahlen(double wert) {
        if ((getKontostand() - wert) >= limit * -1 ){
            System.out.println( wert + " übersteigt das Limit: " + limit);
        }
        else {super.auszahlen(wert);}
    }
}
