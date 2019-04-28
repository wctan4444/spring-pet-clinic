package twc.springframework.twcpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import twc.springframework.twcpetclinic.model.Pet;

public interface PetRepository extends CrudRepository<Pet, Long> {
}