package ec.edu.uce.FitFactory.services;
import ec.edu.uce.FitFactory.model.GymClasses;
import ec.edu.uce.FitFactory.repository.GymClassesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GymClassesServices {
    @Autowired
    private final GymClassesRepository gymClassesRepository;

    @Autowired
    public GymClassesServices(GymClassesRepository gymClassesRepository) {
        this.gymClassesRepository = gymClassesRepository;
    }

    public List<GymClasses> getAllGymClasses(){
        return (List<GymClasses>) gymClassesRepository.findAll();
    }

    public Optional<GymClasses> getGymClassesById(long id) {
        return gymClassesRepository.findById(id);
    }

    public GymClasses saveGymClasses(GymClasses gymClasses) {
        return gymClassesRepository.save(gymClasses);
    }

    public void deleteGymClasses(long id) {
        gymClassesRepository.deleteById(id);
    }
}
