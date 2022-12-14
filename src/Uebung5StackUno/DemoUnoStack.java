package Uebung5StackUno;

public class DemoUnoStack {
    public static void main(String[] args) {

        //Cards werden nicht richtig entfernt, bleiben im Array gespeichert, werden aber durch counter und push Methode bei
        // Bedarf überschrieben!

        Card cardOne = new Card(4, "green");
        System.out.println("cardOne.toString() = " + cardOne.toString());
        System.out.println(cardOne.getColour() + " " + cardOne.getValue());

        Card[] cardsArray = new Card[2];

        CardStack cardStack = new CardStack(cardsArray);
        cardStack.push(cardOne);
        System.out.println("cardStack.toString() = " + cardStack.toString());


        Card cardTwo = new Card(2, "blue");
        cardStack.push(cardTwo);
        System.out.println(cardStack.toString());

        System.out.println();

        Card removedCardOne = cardStack.pop();
        System.out.println("removedCardOne = " + removedCardOne);
        System.out.println(cardStack.toString());

        cardStack.push(new Card(5,"red"));
        System.out.println(cardStack.toString());

        cardStack.push(new Card(4,"yellow"));
    }
}
