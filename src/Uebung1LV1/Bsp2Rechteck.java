package UebungsbeispieleLV1;

public class Bsp2Rechteck {
    public static void main(String[] args) {

        byte breite = 5;
        byte laenge = 8;
        int umfang = (breite * 2) + (laenge * 2);
        int flaeche = breite * laenge;

        System.out.println("Sie haben ein Rechteck mit der länge: " + laenge + " und der breite: " + breite);
        System.out.println("Der Umfang ist: " + umfang);
        System.out.println("Die Fläche beträgt: " + flaeche);


    }
}

