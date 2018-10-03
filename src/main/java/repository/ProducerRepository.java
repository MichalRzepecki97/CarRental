package repository;

import model.Producer;
import org.springframework.data.repository.CrudRepository;

import java.util.Set;

public interface ProducerRepository extends CrudRepository<Producer,Long> {
    Set<Producer>findAllBy();


}
