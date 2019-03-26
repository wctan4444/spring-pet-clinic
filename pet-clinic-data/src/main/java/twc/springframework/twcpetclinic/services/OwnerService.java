package twc.springframework.twcpetclinic.services;

import twc.springframework.twcpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

    //Owner findById(Long id);
    //Owner save(Owner owner);
    //Set<Owner> findAll();

}
