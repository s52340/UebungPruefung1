package FolienLV9WiederverwendungKlassen.PersonCustomer;

public class Address {
    private String street;
    private String zip;
    private String city;
    private String country;

    public Address(String street, String zip, String city, String country) {
        this.street = street;
        this.zip = zip;
        this.city = city;
        this.country = country;
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", zip='" + zip + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                '}';
    }

    //zusätzlich könnte ich noch equals. + hashCode und getter + setter implementieren
}
