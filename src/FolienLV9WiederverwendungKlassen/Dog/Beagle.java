package FolienLV9WiederverwendungKlassen.Dog;

public class Beagle extends Dog{

    public String lovedFood;

    public Beagle(String eyeColor, int weight, String lovedFood) {
        super(eyeColor, weight);
        this.lovedFood = lovedFood;
    }

    @Override
    public String toString() {
        return "Beagle{" +
                "lovedFood='" + lovedFood + '\'' +
                ", eyeColor='" + eyeColor + '\'' +
                ", weight=" + weight +
                '}';
    }
}
