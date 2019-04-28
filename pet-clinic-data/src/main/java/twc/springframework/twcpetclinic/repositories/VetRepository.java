package twc.springframework.twcpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import twc.springframework.twcpetclinic.model.Vet;

public interface VetRepository extends CrudRepository<Vet, Long>  {
}
