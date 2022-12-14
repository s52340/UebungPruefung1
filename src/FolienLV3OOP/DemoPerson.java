package FolienLV3OOP;

public class DemoPerson {
    public static void main(String[] args) {

        Person daniel = new Person();
        daniel.firstname = "Daniel";
        daniel.lastname = "Jansenberger";
        daniel.age = 31;

        Person person2 = new Person();
        person2.firstname = "Nadine";
        person2.lastname = "Jansenberger";
        person2.age = 28;

        System.out.println(daniel.firstname + daniel.lastname + daniel.age);
        System.out.println(person2.firstname + person2.lastname + person2.age);
        System.out.println();
        System.out.println(daniel.toString());
        System.out.println(person2.toString());
        System.out.println();
        daniel.accelerate(2);
        daniel.accelerate(7);
        person2.accelerate(5);
        person2.accelerate(2);
    }
}
