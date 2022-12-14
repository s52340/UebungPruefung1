package Uebung4OOP.Bsp1Rezeptverwaltung;

public class Zutat {
    private String name;
    private int menge;


    public Zutat(String name, int menge) {
        this.name = name;
        this.menge = menge;
    }

    public String getName() {
        return name;
    }

    public int getMenge() {
        return menge;
    }

    @Override
    public String toString() {
        return "Zutat{" +
                "name='" + name + '\'' +
                ", menge=" + menge +
                '}';
    }
}
