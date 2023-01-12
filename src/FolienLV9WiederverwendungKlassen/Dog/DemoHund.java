package FolienLV9WiederverwendungKlassen.Dog;

public class DemoHund {
    public static void main(String[] args) {

        Dog paros = new Dog("brown", 20);
        paros.doSomething();
        System.out.println(paros.toString());

        Beagle mimi = new Beagle("blue", 8, "Butterkekse");
        mimi.doSomething();
        System.out.println(mimi.toString());


    }
}
