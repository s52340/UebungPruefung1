package FolienLV3OOP;

public class Bank {
    public static void main(String[] args) {

        System.out.println("Gehaltskonto.counter = " + Gehaltskonto.counter);

        Gehaltskonto mama = new Gehaltskonto("Mama", "AT33 1234", "4567");
        Gehaltskonto papa = new Gehaltskonto("Papa", "AT33 6789","1234");
        Gehaltskonto alina = new Gehaltskonto("Alina", "AT33 9346", "3456");

        System.out.println("Gehaltskonto.counter = " + Gehaltskonto.counter);
        
        mama.abbuchen(556.27);
        System.out.println("Mama Kontostand: " + mama.getKontostand());
        mama.aufbuchen(233.27);
        System.out.println(mama.toStringInhaberKontostand());
        mama.abbuchen(123.23);
        System.out.println(mama.toStringInhaberKontostand());
        papa.aufbuchen(456.78);
        papa.aufbuchen(345.21);
        papa.aufbuchen(456.78);
        System.out.println(papa.toStringInhaberKontostand());
        alina.aufbuchen(34.56);
        alina.abbuchen(35);
        System.out.println(alina.toStringInhaberKontostand());
        System.out.println();


        Gehaltskonto[] gehaltskontos = {mama, papa, alina};
        for (int i = 0; i < gehaltskontos.length; i++) {
            double kontostandPerson = gehaltskontos[i].getKontostand();
            System.out.println(kontostandPerson);

        }

        System.out.println();
        System.out.println();

        // etwas andere Möglichkeit: - so im Unterricht gemacht:

        Gehaltskonto[] bank = new Gehaltskonto[1000];
        bank[0] = mama;
        bank[1] = papa;
        bank[2] = alina;

        for (int i = 0; i < bank.length; i++) {
            if (bank[i] == null){
                System.out.println(i + "ist die nächste freie Stelle für ein Bankkkonto");
                break;
            }
            else {
                System.out.println(bank[i].getInhaber() + " " + bank[i].getKontostand());
            }
        }

        System.out.println();
        System.out.println("Gehaltskonto.counter = " + Gehaltskonto.counter);

        Gehaltskonto verena = new Gehaltskonto("Verena", "AT33 3455670", "9999");
        System.out.println("Gehaltskonto.counter = " + Gehaltskonto.counter);
        System.out.println(verena.toString());
        System.out.println("verena.counter = " + verena.counter);
        System.out.println("mama.counter = " + mama.counter);
        System.out.println("papa.counter = " + papa.counter);

        char number2 = '2';
        int asciiNumber2 = number2 - '1';
        System.out.println("asciiNumber2 = " + asciiNumber2);

    }
}
