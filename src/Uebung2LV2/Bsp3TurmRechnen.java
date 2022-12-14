package UebungsbeispieleLV2;

public class Bsp3TurmRechnen {
    public static void main(String[] args) {
        //                      a * b = result
        // 2 * 2 = 4            2 * 2 = 4
        // 4 * 3 = 12           3 * 4 = 12
        //12 * 4 = 48           4 * 12 = 48

        int a;
        int b = 5;
        int result;

        for (a = 2; a <= 9; a++) {
            result = a * b;
            System.out.println( a + " * " + b + " = " + result);
            b = result;
        }

        int i = 2;
        while (i <= 9) {
            result = b / i;
            System.out.println(b + " / " + i + " = " + result);
            b = result;
            i++;
        }
    }
}
