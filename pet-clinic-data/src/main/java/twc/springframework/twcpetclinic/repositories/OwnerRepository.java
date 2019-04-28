package twc.springframework.twcpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import twc.springframework.twcpetclinic.model.Owner;

import java.util.List;


public interface OwnerRepository extends CrudRepository<Owner, Long> {

    Owner findByLastName(String lastName);

    List<Owner> findAllByLastNameLike(String lastName);
}