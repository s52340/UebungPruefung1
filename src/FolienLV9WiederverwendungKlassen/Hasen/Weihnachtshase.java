package FolienLV9WiederverwendungKlassen.Hasen;

public class Weihnachtshase extends Hase{

    public Weihnachtshase(String name) {
        super(name);
    }

    @Override
    public void verteilen() {
        System.out.println(name + " verteilt Geschenke unter dem Christbaum");
    }

}
