package FolienLV5Generics.Stack;

public class Stack {
    private int[] elements;
    private int counter;

    public Stack(int[] elements) {
        this.elements = elements;
        this.counter = -1;
    }

    public int pop() {
        if (counter >= 0 && elements.length > 0) {
            counter--;
            return elements[counter];
        } else {
            System.out.println("Stack ist bereits leer");
            return -1;
        }
    }

    public void push(int value){
        elements[counter] = value;
        counter ++;
    }

}
