package FolienLV8Recursion;

public class GGT {
    public static void main(String[] args) {

        int zahlOne = 16;
        int zahlTwo = 12;

        System.out.println(ggT(zahlOne,zahlTwo));

        System.out.println();

        int acczahl = 4;
        System.out.println(sumUpRecursionAccumulator(zahlTwo, acczahl));
    }

    // GGT (21,3) = ggT (3, 0)
    public static int ggT(int a, int b){
        if ( b == 0){
            return a;
        }
        int teiler = a % b;
        return ggT(b,teiler);
    }

    //Beispiel - Angabe woher (nicht in Folien)? war aber in Intellij - Übungen dabei
    public static int sumUpRecursionAccumulator(int n, int acc){
        if (n <=0){
            //Hilfsvariable zurückliefern
            return acc;
        }
        acc = acc + n;   //Summiere und merke dir die Summe!
        return sumUpRecursionAccumulator(n - 1, acc);
    }

}
