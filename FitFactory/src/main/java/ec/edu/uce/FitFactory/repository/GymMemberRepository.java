package ec.edu.uce.FitFactory.repository;

import ec.edu.uce.FitFactory.model.GymMember;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GymMemberRepository extends JpaRepository<GymMember, Long> {
}
