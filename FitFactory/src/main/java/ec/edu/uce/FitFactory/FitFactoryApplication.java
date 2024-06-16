package ec.edu.uce.FitFactory;

import ec.edu.uce.FitFactory.model.Address;
import ec.edu.uce.FitFactory.model.Coach;
import ec.edu.uce.FitFactory.model.GymClasses;
import ec.edu.uce.FitFactory.model.GymMember;
import ec.edu.uce.FitFactory.repository.AddressRepository;
import ec.edu.uce.FitFactory.repository.CoachRepository;
import ec.edu.uce.FitFactory.repository.GymClassesRepository;
import ec.edu.uce.FitFactory.repository.GymMemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class FitFactoryApplication implements CommandLineRunner {

	@Autowired
	CoachRepository coachRepository;
	@Autowired
	GymMemberRepository gymMemberRepository;
	@Autowired
	AddressRepository addressRepository;
	@Autowired
	GymClassesRepository gymClassesRepository;


	public static void main(String[] args) {
		SpringApplication.run(FitFactoryApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {

		Address address = new Address("Luis Argandoña y Diego Barba", "Quito");

		GymMember gymMember = new GymMember(1,"Alexander",25, 2024,address);

		GymClasses gymClasses = new GymClasses();
		gymClasses.setId_gymClasses(001);
		gymClasses.setTrainingName("Cardio");
		gymClasses.setCoachName("Paul");
		gymClasses.setSchedule("8 in the morning");
		gymClasses.setDescription("cardio training");
		gymClasses.setGymMember(gymMember);

		List<Coach> coaches = new ArrayList<>();
		Coach coach1 = new Coach();
		coach1.setId_coach(0001);
		coach1.setName_coach("Paul");
		coach1.setAge(28);
		coach1.setDescription("Certified trainer with expertise in fitness and nutrition");
		coachRepository.save(coach1);

		Coach coach2 = new Coach();
		coach2.setId_coach(0001);
		coach2.setName_coach("Paul");
		coach2.setAge(28);
		coach2.setDescription("Experienced gym trainer dedicated to maximizing your fitness journey");
		coachRepository.save(coach2);

		coaches.add(coach1);
		coaches.add(coach2);

		gymClasses.setCoaches(coaches);

		List<GymClasses> gymClasse1 = new ArrayList<>();
		gymClasse1.add(gymClasses);

		gymMember.setGymClasses(gymClasse1);
		address.setGymMember(gymMember);
		addressRepository.save(address);
		gymMemberRepository.save(gymMember);








	}
}



