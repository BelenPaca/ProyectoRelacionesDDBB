package ec.edu.uce.FitFactory.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Coach {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_coach;
    private String name_coach;
    private int age;
    private String description;


//    @ManyToMany(mappedBy = "coach")
    @OneToMany(mappedBy = "coach")
    private List<GymClasses> gymClasses;

    public long getId_coach() {
        return id_coach;
    }

    public void setId_coach(long id_coach) {
        this.id_coach = id_coach;
    }

    public String getName_coach() {
        return name_coach;
    }

    public void setName_coach(String name_coach) {
        this.name_coach = name_coach;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<GymClasses> getGymClasses() {
        return gymClasses;
    }

    public void setGymClasses(List<GymClasses> gymClasses) {
        this.gymClasses = gymClasses;
    }
}
