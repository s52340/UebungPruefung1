package Uebung13Vererbung1.BspLand;

import java.util.ArrayList;
import java.util.List;

public class DemoLand {
    public static void main(String[] args) {

        Bundesstaat austria = new Bundesstaat();

        Land styria = new Bundesland(1234.56);
        Land sbg = new Bundesland(789.12);

        austria.addLand(styria);
        austria.addLand(sbg);

        System.out.println(austria.getBruttoSozialProdukt());

    }
}
