package FolienLV7Collections.Uebung2Equals;

public class DemoPerson {
    public static void main(String[] args) {

        Person nadi = new Person("Nadine", "Jansenberger");
        Person nadine = new Person("Nadine", "Jansenberger");

        boolean is = nadine.equals(nadi);
        System.out.println(is);


    }
}
