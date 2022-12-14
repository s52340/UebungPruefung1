package Uebung3Arrays;

public class Bsp2ArrayDrehen {
    public static void main(String[] args) {

        String[] woerter = {"Max ","Muster ", "bin ", "ich "};

        printStringArray(woerter);

        System.out.println();
        System.out.println();

        printStringArray(reverseArray(woerter));

    }
    private static void printStringArray(String[] ausgabeArray){
        for (int i = 0; i < ausgabeArray.length; i++) {
            System.out.print(ausgabeArray[i]);
        }
    }

    public static String[] reverseArray(String[] arrayToReverse){
        String[] newReihenfolge = new String[arrayToReverse.length];
        for (int i = arrayToReverse.length -1, j = 0; i >= 0; i--, j++){
            newReihenfolge[j] = arrayToReverse[i];
        }
        return newReihenfolge;
    }


}
