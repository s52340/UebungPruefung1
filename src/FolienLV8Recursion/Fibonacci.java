package FolienLV8Recursion;

public class Fibonacci {
    public static void main(String[] args) {

        int stelle = 11;
        System.out.println(fibonacciNRecursiv(stelle));

    }


    // Stelle 0 = 1
    // Stelle 1 = 1
    // Stelle 2 = 2
    // Stelle 3 = 3
    // Stelle 4 = 5
    // Stelle 5 = 8
    // Stelle 6 = 13
    // Stelle 7 = 21
    // Stelle n = (n-1) + (n-2)
    public static int fibonacciNRecursiv(int n){
        if (n == 1 || n == 0){
            return 1;
        }
        return fibonacciNRecursiv(n-1) + fibonacciNRecursiv(n-2);
    }
}
