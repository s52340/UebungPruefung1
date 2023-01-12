package FolienLV9WiederverwendungKlassen.Hasen;

public class DemoHase {
    public static void main(String[] args) {
        System.out.println("hasi's");

        Hase hase1 = new Hase("Hasi");
        Hase hase2 = new Hase("Hiasi");
        Osterhase osterhase1 = new Osterhase("Osterhasi");
        Osterhase osterhase2 = new Osterhase("Osterhiasi");
        Weihnachtshase weihnachtshase1 = new Weihnachtshase("Weihnachtshasi");
        Weihnachtshase weihnachtshase2 = new Weihnachtshase("Weihnachtshiasi");

        System.out.println(hase1.toString());
        hase1.verteilen();
        hase2.fressen();
        System.out.println(osterhase1.toString());
        osterhase1.verteilen();
        osterhase2.schlafen();
        System.out.println(weihnachtshase1.toString());
        weihnachtshase1.verteilen();
        weihnachtshase2.schlafen();

        System.out.println();

        Hase haseUpCasted = new Osterhase("rabbit");
        haseUpCasted.verteilen();
        System.out.println(haseUpCasted.toString());

        System.out.println();

        Hasenstall hasenstall = new Hasenstall();
        hasenstall.add(hase1);
        hasenstall.add(osterhase1);
        hasenstall.add(weihnachtshase1);
        hasenstall.add(osterhase1);

        hasenstall.whoGivesWhat();
    }
}
