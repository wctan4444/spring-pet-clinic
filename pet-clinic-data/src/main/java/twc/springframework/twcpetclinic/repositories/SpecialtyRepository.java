package twc.springframework.twcpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import twc.springframework.twcpetclinic.model.Speciality;

public interface SpecialtyRepository  extends CrudRepository<Speciality, Long> {
}
