package FolienLV5Generics.SozialesNetzwerk;

// hier noch fehler;
public class DemoSocialNetworkApp {
    public static void main(String[] args) {

        Profil bici = new Profil("Bici","Thaler",28,1800);
        Profil chrisi = new Profil("Moonhunter", "Jansenberger", 28, 1550.34);

        bici.printPage(AccessRoles.Self);

    }
}
