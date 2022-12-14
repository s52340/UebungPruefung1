package Uebung4OOP.Bsp1Rezeptverwaltung;

import java.util.Arrays;

public class Rezept {
    //kann Rezepte verwalten und umrechnen
    private String name;
    private int personen;
    private Zutat[] zutaten;


    public Rezept(String name, int personen, Zutat[] zutaten) {
        this.name = name;
        this.personen = personen;
        this.zutaten = zutaten;
    }

    public String getName() {
        return name;
    }

    public int getPersonen() {
        return personen;
    }

    public Zutat[] getZutaten() {
        return zutaten;
    }

    @Override
    public String toString() {
        return "Rezept{" +
                "name='" + name + '\'' +
                ", personen=" + personen +
                ", zutaten=" + Arrays.toString(zutaten) +
                '}';
    }

    public void printRezept(){
        System.out.print("Rezeptname: " + name + " - ");
        for (int i = 0; i < zutaten.length; i++) {
            System.out.print(zutaten[i].getName() + " " + zutaten[i].getMenge() + ", ");
        }
    }

    public Rezept umrechnen(int leute){
        Zutat[] umgerechneteZut = new Zutat[zutaten.length];
        for (int i = 0; i < zutaten.length; i++) {
            Zutat umgerechneteZutat = new Zutat(zutaten[i].getName(),zutaten[i].getMenge() / personen * leute);
            umgerechneteZut[i] = umgerechneteZutat;
        }
        Rezept umgerechnetesRezept = new Rezept(this.name,leute, umgerechneteZut);
        return umgerechnetesRezept;
    }
}
