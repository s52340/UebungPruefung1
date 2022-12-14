package FolienLV5Generics.MayBeInklEnumMarkus;

import javax.swing.*;

public class GenericsDemo {
    public static void main(String[] args) {
        String greeting = "Hello World!";
        int answerToEverything = 42;
        int geburtstag = 26;

        System.out.println(greeting);
        System.out.println(answerToEverything);

        BorderFormatter<String> stringBorderFormatterborderFormatter = new BorderFormatter();

        //int wird in String umgewandelt :
        String answerToEverythingString = String.valueOf(answerToEverything);


        System.out.println(stringBorderFormatterborderFormatter.formate(greeting));
        System.out.println(stringBorderFormatterborderFormatter.formate(answerToEverythingString));


        BorderFormatter<Integer> integerBorderFormatter = new BorderFormatter<>();
        System.out.println(integerBorderFormatter.formate(answerToEverything));
        System.out.println(integerBorderFormatter.formate(geburtstag));

        BorderFormatter<Boolean> booleanBorderFormatter = new BorderFormatter<>();
        System.out.println(booleanBorderFormatter.formate(3 == 3));
        System.out.println(booleanBorderFormatter.formate(false));


    }
}
