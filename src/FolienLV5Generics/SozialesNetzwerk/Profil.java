package FolienLV5Generics.SozialesNetzwerk;

public class Profil {

    private String username;
    private MayBe<String> lastname;
    private MayBe<Integer> age;
    private MayBe<Double> salary;
    private Profil bestFriend;


    public Profil(String username, String lastname, int age, double salary) {
        this.username = username;
        this.lastname = new MayBe<String>(lastname);
        this.age = new MayBe<>(age);
        this.salary = new MayBe<>(salary);
        this.bestFriend = bestFriend;
    }

    public void setBestFriend(Profil bestFriend) {
        this.bestFriend = bestFriend;
    }

    public void printPage(AccessRoles role){
        System.out.println("My Profil: ");
        System.out.println("username = " + username);
        if (role != AccessRoles.externalUser){
            System.out.println("lastname = " + lastname);
            System.out.println("age = " + age);
        }
        salary.deliverValue(role);
        System.out.println("bestFriend = " + bestFriend);
    }
}
