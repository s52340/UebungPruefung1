package FolienLV9WiederverwendungKlassen.Hasen;

import java.util.ArrayList;

public class Hasenstall {
    private ArrayList<Hase> hasenstall = new ArrayList<>();

    public void add(Hase a){
        hasenstall.add(a);
    }

    //whoGivesWhat oder auch einfach verteilen möglich - has a beziehung
    public void whoGivesWhat(){
        for (Hase h: hasenstall) {
              h.verteilen();
        }
    }
}
