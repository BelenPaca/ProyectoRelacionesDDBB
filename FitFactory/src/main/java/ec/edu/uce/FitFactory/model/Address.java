package ec.edu.uce.FitFactory.model;
import jakarta.persistence.*;

@Entity
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_address;
    private String street;
    private String city;


    @OneToOne(mappedBy = "address", cascade = CascadeType.ALL)
    private GymMember gymMember;

    public Address() {
    }

    public Address(String street, String city) {
        this.street = street;
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public long getId_address() {
        return id_address;
    }

    public void setId_address(long id_address) {
        this.id_address = id_address;
    }

    public GymMember getGymMember() {
        return gymMember;
    }

    public void setGymMember(GymMember gymMember) {
        this.gymMember = gymMember;
    }
}
