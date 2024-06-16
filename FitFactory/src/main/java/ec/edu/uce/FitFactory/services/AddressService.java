package ec.edu.uce.FitFactory.services;

import ec.edu.uce.FitFactory.model.Address;
import ec.edu.uce.FitFactory.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AddressService {

    private final AddressRepository addressRepository;

    @Autowired
    public AddressService(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }

    public List<Address> getAllAddresses() {
        return (List<Address>) addressRepository.findAll();
    }

    public Optional<Address> getAddressById(long id) {
        return addressRepository.findById(id);
    }

    public Address saveAddress(Address address) {
        return addressRepository.save(address);
    }

    public void deleteAddress(long id) {
        addressRepository.deleteById(id);
    }
}
