package Uebung6Strings.Bsp2CSVTeilen;

public class DemoCsvParser {
    public static void main(String[] args) {
        String demo = "Spalte1;Spalte2;Spalte3;Spalte4;Spalte5;Spalte6;Spalte7;";
        String demo2 = "Max;Susi;Georg;John;";

        CsvParser parser = new CsvParser(demo);
        System.out.println("parser.countComma() = " + parser.countComma());
        
        CsvParser parser2 = new CsvParser(demo2);
        System.out.println("parser2.countComma() = " + parser2.countComma());


        String[] result = parser2.parse();
        for (String column: result) {
            System.out.println(column);
        }
        
    }
}
