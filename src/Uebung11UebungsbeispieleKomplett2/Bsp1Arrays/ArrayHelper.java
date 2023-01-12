package Uebung11UebungsbeispieleKomplett2.Bsp1Arrays;

public class ArrayHelper {
    public static void main(String[] args) {

        //                 6 Stellen
        //               0  1  2  3  4  5
        int[] numbers = {8, 5, 1, 9, 0, 4};
        System.out.println(numbers.length);
        for (int n : numbers) {
            System.out.print(n);
        }

        System.out.println();

        arrangeOrder(numbers);
        for (int n : numbers) {
            System.out.print(n);
        }

    }

        public static void arrangeOrder(int[] numbers){
            boolean swapped = true;
            while ( swapped ) {                // das Gleiche wie: while ( swapped == true)
                swapped = false;
                for (int i = 0; i < numbers.length -1 ; i++) {
                    if (numbers[i] > numbers[i + 1]) {
                        int hilfsvara = numbers[i];
                        int hilfsvarb = numbers[i + 1];
                        numbers[i] = hilfsvarb;
                        numbers[i + 1] = hilfsvara;
                        swapped = true;

                        /*   = "Dreieckstausch"
                        int hilfsvar = numbers[i];
                        numbers[i] = numbers[i +1];
                        numbers[i+1] = hilfsvar;
                         */
                    }
                }
            }
        }


}