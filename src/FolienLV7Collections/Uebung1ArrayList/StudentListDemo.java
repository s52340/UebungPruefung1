package FolienLV7Collections.Uebung1ArrayList;

import FolienLV7Collections.Uebung1ArrayList.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentListDemo {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        Student studentOne = new Student(001, "Nadine Jansenberger");
        students.add(studentOne);
        students.add(new Student(002,"Christoph Jansenberger"));
        Student danielJansenberger = new Student(003, "Daniel Jansenberger");
        students.add(danielJansenberger);
        students.remove(students.get(1));

        for (Student s: students) {
            System.out.print(s.toString() + " ");
        }

        System.out.println(students.get(0));

        students.add(1,new Student(002, "Christoph Jansenberger"));

        System.out.println();
        for (Student s: students) {
            System.out.print(s + " ");
        }
        System.out.println();
        System.out.println(students.contains(studentOne));
        System.out.println(students.contains(danielJansenberger));

    }
}
