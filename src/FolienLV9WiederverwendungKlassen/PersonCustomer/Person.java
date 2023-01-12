package FolienLV9WiederverwendungKlassen.PersonCustomer;

public class Person {
    protected String firstname;
    protected String lastname;


    public Person(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public void doSomething(){
        System.out.println(firstname + lastname +" geht einkaufen");
    }

    //tut "nichts" - aber void nicht gut zu überschreiben, daher String zurückliefern
    public String print(){
        return firstname + " " + lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                '}';
    }
}
