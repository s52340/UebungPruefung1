package Uebung6Strings.Bsp2CSVTeilen;

public class CsvParser {
    private String csvLine;


    public CsvParser(String csvLine) {
        this.csvLine = csvLine;
    }

    public int countComma(){
        int counter = 0;
        for (int i = 0; i < csvLine.length(); i++) {
            if (csvLine.charAt(i) == ';'){
                counter ++;
            }
        }
        return counter;
    }

    public String[] parse() {
        {
            String[] result = new String[countComma()];
            int pos = 0;
            for (int i = 0; i < result.length; i++)
                result[i] = "";

            for (int i = 0; i < csvLine.length(); i++) {
                char c = csvLine.charAt(i);
                if (c == ';') {
                    pos++;
                } else {
                    result[pos] += c;
//				System.out.println(pos + ": " + result[pos]);
                }
            }

            return result;
        }
    }
}
