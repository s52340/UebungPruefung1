package Uebung7ValidierungIban;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class IbanAnwendung {
    public static void main(String[] args) {
        // IBAN: AT61 1904 3002 3457 3201
        //       AT611904300234573201
        System.out.println("IBAN-Validierung");
        System.out.println("Bitte geben Sie Ihren IBAN ein - in einer Reihe ohne Leerzeichen:");

        Scanner scanner = new Scanner(System.in);
        String iban = scanner.next();

        System.out.println("Ihr IBAN ist: " + iban);

        IbanValidationService ibanValidationService = new IbanValidationService(iban);

        System.out.println("Ländercode: " + ibanValidationService.getCountryCode());
        System.out.println("Prüfsumme: " + ibanValidationService.getCheckSum());
        System.out.println("Kontonummer: " + ibanValidationService.getAccountNumber());
        //System.out.println(ibanValidationService.getCountryCodeNumber());
        System.out.println("Prüfzahl: " + ibanValidationService.getFullCode());

        int[] arr = ibanValidationService.buildArray();
        System.out.println("array = " + Arrays.toString(arr));

        System.out.println("Die berechnete Prüfzahl= " + ibanValidationService.calcCheckSum());

        System.out.println("Ist der Iban korekt: " + ibanValidationService.isIbanCorrect());


    }
}
