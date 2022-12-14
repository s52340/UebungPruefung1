package UebungsbeispieleLV2;

public class Bsp1Notendemo {
    public static void main(String[] args) {

        System.out.println("Meine Note ist: " + getNotentext(52));

        String danielNote = getNotentext(91);
        System.out.println("danielNote = " + danielNote);

        String nadineNote = getNotentext(72);
        System.out.println("nadineNote = " + nadineNote);


    }
    public static String getNotentext(int punkte){
        if (punkte >= 90){
            return "sehr gut";
        } else if (punkte >= 78){
            return "gut";
        } else if (punkte >= 65){
            return "Befriedigend";
        } else if (punkte >= 51){
            return "Genügend";
        }
        else{
            return "Ungenügend";
        }

    }
}
