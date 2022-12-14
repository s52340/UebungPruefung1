package FolienLV3OOP;

public class Person{

    public String firstname;
    public String lastname;
    public int age;
    private int socialnumber;
    private int currentKids;

    public void accelerate(int newKids){
        currentKids = newKids < 4 ? newKids : 4;
        String info;
        info = "Current Kids: " + currentKids;
        if (currentKids == 4){
            info += " - maximum reached";}   //info = info + " - maximum reached"
        System.out.println(Person.this.toString() + info);
    }


    @Override
    public String toString() {
        return "Person{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", age=" + age +
                ", socialnumber=" + socialnumber +
                ", currentKids=" + currentKids +
                '}';
    }
}


