package FolienLV7Collections;

public class Uebung1ArrayList {
    private int matNr;
    private String fullName;

    public Uebung1ArrayList(int matNr, String fullName) {
        this.matNr = matNr;
        this.fullName = fullName;
    }

    @Override
    public String toString() {
        return "Uebung1ArrayList{" +
                "matNr=" + matNr +
                ", fullName='" + fullName + '\'' +
                '}';
    }
}
