package ec.edu.uce.FitFactory.services;

import ec.edu.uce.FitFactory.model.Coach;
import ec.edu.uce.FitFactory.repository.CoachRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CoachServices {
    @Autowired
    private final CoachRepository coachRepository;

    @Autowired
    public CoachServices(CoachRepository coachRepository) {
        this.coachRepository = coachRepository;
    }

    public List<Coach> getAllCoaches() {
        return (List<Coach>) coachRepository.findAll();
    }

    public Optional<Coach> getCoachById(long id) {
        return coachRepository.findById(id);
    }

    public Coach saveCoach(Coach coach) {
        return coachRepository.save(coach);
    }

    public void deleteCoach(long id) {
        coachRepository.deleteById(id);
    }


}
