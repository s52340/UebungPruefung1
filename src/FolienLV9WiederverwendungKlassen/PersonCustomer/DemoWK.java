package FolienLV9WiederverwendungKlassen.PersonCustomer;

import FolienLV9WiederverwendungKlassen.PersonCustomer.Address;
import FolienLV9WiederverwendungKlassen.PersonCustomer.Customer;

public class DemoWK {
    public static void main(String[] args) {
       Customer nadi = new Customer("Nadine","Jansenberger", 1);
       Customer veri = new Customer("Verena", "Thaler",203);

       nadi.addAddresess(new Address("Boder", "8786", "Rottenmann", "Austria"));
       veri.addAddresess(new Address("Lassing", "8200", "Liezen", "Austria"));

        System.out.println(nadi.toString());
        System.out.println(veri.toString());

        nadi.doSomething();
        System.out.println(nadi.print());
    }
}
