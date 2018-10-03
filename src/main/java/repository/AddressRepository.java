package repository;

import model.Address;
import org.springframework.data.repository.CrudRepository;

import java.util.Set;

public interface AddressRepository extends CrudRepository<Address,Long> {

    Set<Address> findAllByCity(String city);
    Set<Address> findAllBy();
    Set<Address> findAllByState(String state);
    Set<Address> findAllByCityAndState(String city, String state);
    Address findTop1ByOrderByCity();
}
