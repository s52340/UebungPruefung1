package FolienLV7Collections.Uebung1ArrayList;

public class Student {
    private int matNr;
    private String fullName;

    public Student(int matNr, String fullName) {
        this.matNr = matNr;
        this.fullName = fullName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "matNr=" + matNr +
                ", fullName='" + fullName + '\'' +
                '}';
    }
}
