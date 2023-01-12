package FolienLV9WiederverwendungKlassen.Hasen;

public class Osterhase extends Hase {

    public Osterhase(String name) {
        super(name);
    }

    @Override
    public void verteilen() {
        System.out.println( super.name + " versteckt Geschenke und Ostereier");;
    }
}
