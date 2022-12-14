package Uebung2LV2;

public class Bsp2Winterreifen {
    public static void main(String[] args) {

        System.out.println("Sollen Winterreifen verwendet werden?");
        System.out.println("Temp: 6C + nicht rutschig: " + isWinterreifenPflicht(6, false));
        System.out.println("Temp: 8C + rutschig: " + isWinterreifenPflicht(8, true));
        System.out.println("Temp: 3C + nicht rutschig: " + isWinterreifenPflicht(3, false));


        System.out.println(ergebnisWinterreifenpflicht(isWinterreifenPflicht(7, true)));
        System.out.println(ergebnisWinterreifenpflicht(isWinterreifenPflicht(2, false)));
        System.out.println(ergebnisWinterreifenpflicht(isWinterreifenPflicht(6, false)));

    }



    public static boolean isWinterreifenPflicht( int temperatur, boolean rutschigeFahrbahn){
        if (temperatur < 10 && rutschigeFahrbahn == true){
            boolean resultatWinterreifenPflicht = true;
            return resultatWinterreifenPflicht;
        }
        if (temperatur < 4 ){
            return true;
        }
        else {
            return false;
        }
    }

    public static String ergebnisWinterreifenpflicht(boolean isWinterreifenpflicht){
        if (isWinterreifenpflicht == true){
            return "Bitte Winterreifen verwenden";
        }
        else {
            return "Winterreifen sind nicht erforderlich";
        }
    }
}
