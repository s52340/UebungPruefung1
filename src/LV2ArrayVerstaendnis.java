public class ArrayVerstaendnis {
    public static void main(String[] args) {

        int[] array1;
        array1 = new int[3];
        array1[0] = 3;
        array1[1] = 4;
        array1[2] = 6;

        //in einem Schritt:
        int[] array2 = {2,5,10};

        System.out.println("Länge von Array: " + array1.length);
        System.out.println("Array an der Stelle 1 [0]: " + array1[0]);

        for (int i = 0; i <= array1.length - 1; i++) {
            System.out.print("Stelle: " + i + " Input Array " + array1[i] + " | ");
        }

        System.out.println();
        System.out.println();

        int[] array3 = new int[3];
        for (int i = 0; i < array1.length; i++) {
            array3[i]= array1[i] + array2[i];
            System.out.println("Array3Stelle: " + i + " Input Array3 " + array3[i] + " | ");
        }

        System.out.println();

        int[] a4 = new int[3];
        for (int i = 0; i < array1.length; i++) {
            a4[i] = array1[i] * array2[i];
            System.out.println("A4Stelle: " + i + " Input A4 " + a4[i] + " | ");
        }

        System.out.println(array1[0] + array2[0]);
    }
}
