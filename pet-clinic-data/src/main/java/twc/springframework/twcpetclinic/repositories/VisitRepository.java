package twc.springframework.twcpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import twc.springframework.twcpetclinic.model.Visit;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}
