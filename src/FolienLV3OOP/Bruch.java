package FolienLV3OOP;

public class Bruch {

    private int zaehler;
    private int nenner;     // Schreibweise-Reihenfolge wichtig zähler / nenner(=teiler) oder im Konstruktor dann vertauschen!

    //counter Erweiterung:
    private static int counter = 0;

    public Bruch(int zaehler, int nenner) {
        this.zaehler = zaehler;
        this.nenner = nenner;
        this.counter ++;
    }

    public int getZaehler() {
        return zaehler;
    }

    public int getNenner() {
        return nenner;
    }
    // Warum nicht: public double toDecimal(int zaehler, int nenner)   ????
    public double toDecimal(){
        double decimalZahl = zaehler / (nenner*1.0);
        return decimalZahl;
    }
    // Warum auch hier keine Input Parameter? (int zähler, int nenner) ??
    public void print(){
        System.out.println(this.zaehler + " / " + this.nenner);
    }

    public Bruch multiplicate(Bruch b2){
        int newzaehler = zaehler * b2.zaehler;
        int newnenner = nenner * b2.nenner;
        Bruch newBruch = new Bruch(newzaehler,newnenner);
        return newBruch;
    }

    public Bruch multiplicate(Bruch b2, Bruch b3){
        int newzaehler2 = zaehler * b2.zaehler * b3.zaehler;
        int newnenner2 = nenner * b2.nenner * b3.nenner;
        Bruch newBruch2 = new Bruch(newzaehler2,newnenner2);
        return newBruch2;
    }

    public void printCounter(){
        System.out.println("counter = " + counter);
    }
}
