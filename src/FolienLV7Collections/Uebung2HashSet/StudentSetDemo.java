package FolienLV7Collections.Uebung2HashSet;

import java.util.HashSet;

public class StudentSetDemo {
    public static void main(String[] args) {
        HashSet<Student> students = new HashSet<>();

        Student nadi = new Student(001, "Nadine J.");
        Student chrisi = new Student(002, "Christoph J.");
        Student dani = new Student(003,"Daniel J.");

        students.add(nadi);
        students.add(chrisi);
        students.add(dani);

        System.out.println(students.toString());

        HashSet<String> strings = new HashSet<>();
        // zum set hinzufügen
        strings.add("Hallo");
        strings.add("Servus");
        System.out.println(strings.size());
        System.out.println(strings.toString());






    }


}
