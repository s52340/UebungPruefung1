package Uebung4OOP.Bsp2Bestellverwaltung;

public class DemoBestellung {
    public static void main(String[] args) {
        Bestellzeile kugelschreiber = new Bestellzeile("Kugelschreiber", 12,3);
        Bestellzeile postIt = new Bestellzeile("Postit", 5, 2);
        Bestellzeile bloecke = new Bestellzeile("Blöcke", 7, 5);
        Bestellzeile radiergummi = new Bestellzeile("Radiergummi", 3,1);

        Bestellzeile[] bestellzeileAhd = {kugelschreiber,postIt,bloecke};
        Bestellzeile[] bestellzeileLkh = {kugelschreiber, postIt, bloecke, radiergummi};

        Bestellung ahd = new Bestellung("0001", bestellzeileAhd);
        Bestellung lkh = new Bestellung("0002", bestellzeileLkh);

        ahd.printBestellung();
        System.out.println();
        System.out.println("ahd.getGesammtKosten() = " + ahd.getGesammtKosten());
        System.out.println();
        lkh.printBestellung();
        System.out.println();
        System.out.println("lkh.getGesammtKosten() = " + lkh.getGesammtKosten());
    }
}
