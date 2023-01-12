package FolienLV9WiederverwendungKlassen.PersonCustomer;

import FolienLV9WiederverwendungKlassen.PersonCustomer.SpecialCustomer;

public abstract class VerySpecialCustomer extends SpecialCustomer {
    private int verySpecialNumber;


    public VerySpecialCustomer(String firstname, String lastname, int customerNumber, String someAttribute, int verySpecialNumber) {
        super(customerNumber, someAttribute);
        super.firstname = firstname;
        super.lastname = lastname;
        super.customerNumber = 9;
        this.verySpecialNumber = verySpecialNumber;
    }

}
