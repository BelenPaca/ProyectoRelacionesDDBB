package ec.edu.uce.FitFactory.repository;

import ec.edu.uce.FitFactory.model.Coach;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CoachRepository  extends JpaRepository<Coach, Long> {
}
