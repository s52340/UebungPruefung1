package FolienLV9WiederverwendungKlassen.Dog;

public class Dog {

    public String eyeColor;
    public int weight;

    public Dog(String eyeColor, int weight) {
        this.eyeColor = eyeColor;
        this.weight = weight;
    }

    public void doSomething(){
        System.out.println("wuff");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "eyeColor='" + eyeColor + '\'' +
                ", weight=" + weight +
                '}';
    }
}
