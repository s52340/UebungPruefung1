public class Calculator {
    public static void main(String[] args) {

        int a = 5;
        int b = 3;

        print(add(a, b));
        print(sub(a,b));
        print(mult(a,b));
        //print(div(a,b));  geht nicht weil Methode print einen Input Parameter mit Int benötigt!
        System.out.println(div(a,b));
        print(mod(a,b));

        int[] numbers = {3,5,2,7};
        System.out.println("Die Summe der Zahlen im Array numbers [3,5,2,7] ist: " + sum(numbers));
    }
    public static void print(int zahl){
        System.out.println(" Das Ergebnis ist: " + zahl);
    }

    private static int add(int zahl1, int zahl2) {
        int c = zahl1 + zahl2;
        System.out.println("Das Ergebnis der Addition von " + zahl1 + " + " + zahl2 + " = " + c);
        return c;
    }

    private static int sub(int zahl1, int zahl2) {
        int d = zahl1 - zahl2;
        return d;
    }
    private static int mult(int zahl1, int zahl2) {
        int e = zahl1 * zahl2;
        return e;
    }

    private static double div(int zahl1, int zahl2) {
        double f = zahl1 / (double) zahl2;
        return f;
    }
    private static int mod(int zahl1, int zahl2) {
        int g = zahl1 % zahl2;
        return g;
    }


    public static int sum(int[] zahlen){
        int resultSum = 0;
        for (int i = 0; i < zahlen.length; i++) {
             resultSum = zahlen[i] + resultSum;
        }
        return resultSum;
    }
}
