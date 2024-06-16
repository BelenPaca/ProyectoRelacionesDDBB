package ec.edu.uce.FitFactory.repository;


import ec.edu.uce.FitFactory.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {
}
