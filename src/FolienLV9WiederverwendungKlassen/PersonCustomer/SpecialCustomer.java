package FolienLV9WiederverwendungKlassen.PersonCustomer;

import FolienLV9WiederverwendungKlassen.PersonCustomer.Customer;

public class SpecialCustomer extends Customer {
    private String someAttribute;


    public SpecialCustomer(int customerNumber, String someAttribute) {
        super("System", "User", customerNumber);
        this.someAttribute = someAttribute;
    }
}
