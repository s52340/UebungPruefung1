package Uebung4OOP.Bsp1Rezeptverwaltung;

public class DemoRezept {
    public static void main(String[] args) {
        Zutat eier = new Zutat("Eier",2);
        Zutat mehl = new Zutat("Mehl", 60);
        Zutat salz = new Zutat("Salz", 1);
        Zutat milch = new Zutat("Milch", 150);
        Zutat schoko = new Zutat("Schokolade", 25);

        Zutat[] zutatenPalas = {eier,mehl,salz,milch};
        Zutat[] zutatenSchokoKu = {eier, mehl, milch, schoko};

        Rezept palatschinken = new Rezept("Palatschinken",2, zutatenPalas);
        Rezept schokokuchen = new Rezept("Schokokuchen", 2, zutatenSchokoKu);

        System.out.println("schokokuchen.toString = " + schokokuchen.toString());
        schokokuchen.printRezept();

        System.out.println();
        System.out.println("schokokuchen.umrechnen(4) = " + schokokuchen.umrechnen(4));
    }
}
