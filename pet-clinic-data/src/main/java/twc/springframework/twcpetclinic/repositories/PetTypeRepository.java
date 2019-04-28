package twc.springframework.twcpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import twc.springframework.twcpetclinic.model.PetType;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
