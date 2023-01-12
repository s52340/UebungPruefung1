package FolienLV9WiederverwendungKlassen.PersonCustomer;

import java.util.ArrayList;

public class Customer extends Person {
    protected int customerNumber;
    private ArrayList<Address> addresses =  new ArrayList<>();


    public Customer(String firstname, String lastname, int customerNumber) {
        super(firstname, lastname);
        this.customerNumber = customerNumber;
    }
    public void addAddresess(Address a){
        addresses.add(a);
    }

    @Override
    public String print(){
        return customerNumber + "; " + super.print();
    }

    @Override
    public void doSomething() {
        super.doSomething();
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerNumber=" + customerNumber +
                ", addresses=" + addresses +
                '}';
    }
}
