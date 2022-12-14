package Uebung7ValidierungIban;

public class IbanValidationService {
    private String iBan;
    private int calculatedCheckSum;

    public IbanValidationService(String iBan) {
        this.iBan = iBan;
        this.calculatedCheckSum = -1;
    }

    public String getCountryCode(){
        String part = iBan.substring(0,2);  //Startindex inklusive, endindex exklusive!!
        return part;
    }

    //die Checksumme (Index 2 & 3) als int Wert retourniert
    public int getCheckSum(){
        String part = iBan.substring(2,4);   // 2, 3 --> 61
        int value = Integer.valueOf(part);
        return value;
    }

    public String getAccountNumber(){
        String part = iBan.substring(4,iBan.length());
        return part;
    }

    //Iteration2
    //Buchstaben des Ländercodes in Zahlen umwandelt  A = 65 --> 10 T=84-->29  (-55)
    public String getCountryCodeNumber(){
        char firstChar = iBan.charAt(0);       //A
        int intFirstChar = firstChar;          // 65
        intFirstChar = firstChar - 55;         // 10
        char secondChar =  iBan.charAt(1);     //T
        int intSecondChar = secondChar;
        intSecondChar = secondChar -55;        // 29
        String countryCodeNumber = "" + intFirstChar + intSecondChar + 0 + 0;
        return countryCodeNumber;
    }

    public String getFullCode(){
        String fullCode = getAccountNumber() + getCountryCodeNumber();
        return fullCode;
    }

    //Iteration3
    public int[] buildArray(){
        int[] array = new int[getFullCode().length()];
        for (int i = 0; i < getFullCode().length(); i++) {
            char charI = getFullCode().charAt(i);             // '4' = 52//'1'=49
            int intCharI = charI;                             // '0' = 48
            intCharI = intCharI - '0';                        // 52-48 = 4//49-48=1
            array[i] = intCharI;
        }
        return array;
    }

    //Iteration4:
    public int calcCheckSum(){
        int hilfsvar = 0;
        for (int i = 0; i < buildArray().length; i++) {
            hilfsvar = ((hilfsvar * 10) + buildArray()[i]) % 97;
        }
        int checksum = 98 - hilfsvar;
        calculatedCheckSum = checksum;
        return calculatedCheckSum;
    }

    public boolean isIbanCorrect(){
        if (calculatedCheckSum == getCheckSum()){
            return true;
        }
        else return false;
    }
}
