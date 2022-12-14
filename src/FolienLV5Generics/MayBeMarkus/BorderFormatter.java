package FolienLV5Generics.MayBeInklEnumMarkus;

public class BorderFormatter<T>{                             //oben <T> reinschreiben
    public String formate(T input){                          //aus String -> T machen)
        String text = input.toString();
        return "+-" + "-".repeat(text.length()) + "-+\n"
                + "| " + input + " |\n" +                   //text geht auch
                "+-" + "-".repeat(text.length()) + "-+";
    }
}
