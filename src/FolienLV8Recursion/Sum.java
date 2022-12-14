package FolienLV8Recursion;

import java.util.ArrayList;

public class Sum {
    public static void main(String[] args) {


        ArrayList<Integer> zahlen = new ArrayList<>();

        zahlen.add(1);
        zahlen.add(3);
        zahlen.add(5);

        System.out.println("Die Länge der Arraylist zahlen = " + zahlen.size());
        System.out.println();
        for (Integer s: zahlen){
            System.out.println(s);
        }
        System.out.println(zahlen.get(zahlen.size()-1));

        System.out.println(recursiveSum(zahlen));


    }
    // 3 + 2 = 5 (sum 3)
    // 3 + 2 + 1 = 6 (sum ?)
    // 3 + 2 + 1 + 0 = 6
    // n + (n-1) = sum(n)

    public static int recursiveSum(ArrayList<Integer> values){
        //oder if (values.isEmpty())
        if(values.size() == 0){
            return 0;
        }
        Integer value = values.remove(0);
        return value + recursiveSum(values);
    }

}