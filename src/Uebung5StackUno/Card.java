package Uebung5StackUno;

public class Card {
    private int value;
    private String colour;


    public Card(int value, String colour) {
        if (value >= 0 && value <= 9) {
            this.value = value;
        }
       else {
            System.out.println("Error: diese Zahl ist nicht erlaubt - muss zwischen 0-9 sein.");
        }

        if (colour.equals("blue") || colour.equals("green") || colour.equals("yellow") ||colour.equals("red")){
            this.colour = colour;
        }
        else {
            System.out.println("Error: Diese Farbe ist nicht erlaubt" + colour);
        }
    }

    public int getValue() {
        return value;
    }

    public String getColour() {
        return colour;
    }

    @Override
    public String toString() {
        return "Card{" +
                "value=" + value +
                ", colour='" + colour + '\'' +
                '}';
    }
}
