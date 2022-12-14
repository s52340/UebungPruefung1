package Uebung6Strings.Bsp1WoerterGrossbuchstaben;

public class WoerterStartenMitGrossbuchstaben {
    public static void main(String[] args) {

        String text = " wörter starten mit großbuchstaben";

        // Ergebnis: "Wörter Starten Mit Großbuchstaben";

        System.out.println(text.length());


        for (int i = 0; i < text.length(); i++) {
            if (!Character.isLetter(text.charAt(i)) ){
                Character a = text.charAt(i + 1);
                String b = String.valueOf(a);
                 b = b.toUpperCase();
                System.out.print(" ");
                System.out.print(b);
                i++;
            }
            else if (i == 0 && Character.isLetter(text.charAt(i))){
                Character a = text.charAt(0);
                String b = String.valueOf(a);
                b = b.toUpperCase();
                System.out.print(b);

            } else {System.out.print(text.charAt(i));
            }
        }
        // ev. noch in Methode auslagern;


        // Andere Möglichkeit Lehrer:

        String result = "";

        for (int i = 0; i < text.length(); i++)
        {
            char c = text.charAt(i);
            // ihre if-abfrage
            if (i == 0 || text.charAt(i - 1) == ' '){
                c = Character.toUpperCase(c);
            }

            result = result + c;
            System.out.println(result); // kann man auch auskommentieren
        }

        System.out.println("Ausgangstext: " + text);
        System.out.println("Ergebnis: " + result);
    }
}
