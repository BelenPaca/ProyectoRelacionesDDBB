package ec.edu.uce.FitFactory.model;


import jakarta.persistence.*;

import java.util.List;

@Entity
public class GymClasses {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_gymClasses;
    private String trainingName;
    private String coachName;
    private String schedule;
    private String description;

    @ManyToOne
    @JoinColumn(name = "id_partner")
    private GymMember gymMember;
    @JoinColumn(name = "id_coach")
    private Coach coach;




    @ManyToMany
    @JoinTable(
            name = "gymClasses_coach",
            joinColumns = @JoinColumn(name = "id_gymClasses"),
            inverseJoinColumns = @JoinColumn(name = "id_coach")
    )

    private List<Coach> coaches;

    public long getId_gymClasses() {
        return id_gymClasses;
    }

    public void setId_gymClasses(long id_gymClasses) {
        this.id_gymClasses = id_gymClasses;
    }

    public String getTrainingName() {
        return trainingName;
    }

    public void setTrainingName(String trainingName) {
        this.trainingName = trainingName;
    }

    public String getCoachName() {
        return coachName;
    }

    public void setCoachName(String coachName) {
        this.coachName = coachName;
    }

    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public GymMember getGymMember() {
        return gymMember;
    }

    public void setGymMember(GymMember gymMember) {
        this.gymMember = gymMember;
    }

    public List<Coach> getCoaches() {
        return coaches;
    }

    public void setCoaches(List<Coach> coaches) {
        this.coaches = coaches;
    }
}
