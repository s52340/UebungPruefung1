package Uebung13Vererbung1.BspKonto;

public class SparKonto extends Konto{


    public SparKonto(String inhaber) {
        super(inhaber);
    }


    public void einzahlen(double wert) {
        super.einzahlen(wert);
    }


    @Override
    public void auszahlen(double wert) {
        if ((getKontostand() - wert) < 0){
            System.out.println( wert + " übersteigt Kontostand " + getKontostand() +
                    " darf nicht ins Minus gehen");
        }
        else {super.auszahlen(wert);
        }
    }
}
