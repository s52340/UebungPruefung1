package Uebung5StackUno;

import java.util.Arrays;

public class CardStack {
    private Card[] cards;
    private int counter;

    public CardStack(Card[] cards) {
        this.cards = cards;
        this.counter = -1;
    }

    public void push(Card newCard){
        if (cards.length > counter + 1 ){
            counter ++;
            cards[counter] = newCard;
        }
        else {
            System.out.println("Stapel ist schon voll!");
        }
    }

    public Card pop(){
        if (counter >= 0){
       Card removedCard = cards[counter];
       counter --;
       return removedCard;
        }
        else {
            System.out.println("Stack ist bereits leer");
            return null;
        }
    }
// für mich zum verständnis!
    @Override
    public String toString() {
        return "CardStack{" +
                "cards=" + Arrays.toString(cards) +
                ", counter=" + counter +
                '}';
    }
}
