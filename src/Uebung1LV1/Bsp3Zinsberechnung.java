package Uebung1LV1;

public class Bsp3Zinsberechnung {
    public static void main(String[] args) {

        int kontstand = 1000;
        double zinsen = 2.25;

        System.out.println("Ihr Kontostand beträgt am Ende: " + getZinswertEndeLaufzeit(kontstand,zinsen));

        kontstand = 2300;
        zinsen = 5.5;
        double zinswertEndeLaufzeit = getZinswertEndeLaufzeit(kontstand, zinsen);
        System.out.println("Ihr zweiter Kontostand beträgt: " + zinswertEndeLaufzeit);

    }

    private static double getZinswertEndeLaufzeit(int kontstand, double zinsen) {
        double zinswertEndeLaufzeit = (kontstand / 100) * zinsen;
        return zinswertEndeLaufzeit;
    }
}
