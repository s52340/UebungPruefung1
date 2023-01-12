package Uebung13Vererbung1.BspKonto;

// RICHTIG ?? LEIDER Keine LÖSUNG  :((
public class DemoKonto {
    public static void main(String[] args) {

        Konto bici = new Konto("Bianca");
        GiroKonto veriGiroK = new GiroKonto("Verena", 500);
        JugendGiroKonto aliJugK = new JugendGiroKonto("Alina", 700, 900);
        SparKonto papiSparK = new SparKonto("Karl");

        bici.auszahlen(400);
        System.out.println(bici.getKontostand());
        System.out.println(bici.toString());

        veriGiroK.auszahlen(300);
        veriGiroK.einzahlen(600);
        System.out.println(veriGiroK.getKontostand());
        aliJugK.einzahlen(100);
        System.out.println(aliJugK.toString());
        aliJugK.auszahlen(850);
        System.out.println(papiSparK.toString());
        papiSparK.auszahlen(100);

        System.out.println();

        Konto castenVersuch = new JugendGiroKonto("Karsten",200,400);
        castenVersuch.einzahlen(100);
        castenVersuch.auszahlen(300);
        System.out.println(castenVersuch.toString());

        //2.Versuch VORSICHT !
        GiroKonto zweiterCastenVersuch = (GiroKonto) castenVersuch;

    }
}
