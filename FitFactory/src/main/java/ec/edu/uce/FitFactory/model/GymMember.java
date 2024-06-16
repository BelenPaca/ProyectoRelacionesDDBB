package ec.edu.uce.FitFactory.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class GymMember {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_partner;
    private String name_partner;
    private int age;
    private int registrationDate;

    @JoinColumn(name = "id_address")
    @OneToOne(cascade = CascadeType.ALL)
    private Address address;

    @OneToMany(mappedBy = "gym_member", cascade = CascadeType.ALL)
    private List<GymClasses> gymClasses;



    public GymMember(long id_partner, String name_partner, int age, int registrationDate,Address address) {
        this.id_partner = id_partner;
        this.name_partner = name_partner;
        this.age = age;
        this.registrationDate = registrationDate;
        this.address = address;

    }

    public long getId_partner() {
        return id_partner;
    }

    public void setId_partner(long id_partner) {
        this.id_partner = id_partner;
    }

    public String getName_partner() {
        return name_partner;
    }

    public void setName_partner(String name_partner) {
        this.name_partner = name_partner;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(int registrationDate) {
        this.registrationDate = registrationDate;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<GymClasses> getGymClasses() {
        return gymClasses;
    }

    public void setGymClasses(List<GymClasses> gymClasses) {
        this.gymClasses = gymClasses;
    }
}
