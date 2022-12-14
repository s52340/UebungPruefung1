import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {

        distanzberechner();
        double kilometer = kilometereingabe();
        double miles = kmToMiles(kilometer);
        System.out.println(kilometer + " Kilometer sind ca. " + miles + " Meilen.");

        System.out.println(miles + " Meilen sind ca. " + milesToKm(miles) + " Kilometer.");
    }

    private static void distanzberechner() {
        System.out.println("Distanzberechner");
        System.out.println("Bitte geben Sie einen Kilometerwert ein: ");
    }

    public static double kilometereingabe(){
        Scanner scanner = new Scanner(System.in);
        double kmScanner = scanner.nextDouble();
        return kmScanner;
    }

    public static double kmToMiles(double km) {
        double miles = km / 1.609;
        return miles;
    }

    public static double milesToKm(double miles){
        double kilometer = miles * 1.609;
        return kilometer;
    }

}
