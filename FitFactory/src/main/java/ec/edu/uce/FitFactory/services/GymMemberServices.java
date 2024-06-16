package ec.edu.uce.FitFactory.services;


import ec.edu.uce.FitFactory.model.GymMember;
import ec.edu.uce.FitFactory.repository.GymMemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GymMemberServices {
    @Autowired
    private final GymMemberRepository gymMemberRepository;

    @Autowired
    public GymMemberServices(GymMemberRepository gymMemberRepository) {
        this.gymMemberRepository = gymMemberRepository;
    }

    public List<GymMember> getAllGymMember(){
        return (List<GymMember>) gymMemberRepository.findAll();
    }

    public Optional<GymMember> getGymMemberById(long id) {
        return gymMemberRepository.findById(id);
    }

    public GymMember saveGymMember(GymMember gymClasses) {
        return gymMemberRepository.save(gymClasses);
    }

    public void deleteGymMember(long id) {
        gymMemberRepository.deleteById(id);
    }
}
