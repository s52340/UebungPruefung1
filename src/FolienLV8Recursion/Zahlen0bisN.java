package FolienLV8Recursion;

public class Zahlen0bisN {

    public static void main(String[] args) {

        int zahl = 3;
        fromZeroToNRecursiv(zahl);
        System.out.println();
        fromNToZero(zahl);
    }


    // 3
    // 2
    // 1
    // 0
    public static void fromZeroToNRecursiv(int n){
        if (n == 0){
            System.out.println(0);
            return;
        }
        fromZeroToNRecursiv(n - 1);
        System.out.println(n);

    }

    // 3 - 2 - 1 - 0

    public static void fromNToZero(int n){
        if (n == 0){
            System.out.println(0);
            return;
        }
        System.out.println(n);
        fromNToZero(n -1);

    }
}
