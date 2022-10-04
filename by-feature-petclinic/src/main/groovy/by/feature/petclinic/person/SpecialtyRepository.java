package by.feature.petclinic.person;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

public interface SpecialtyRepository extends CrudRepository<Specialty, Integer>, SpecialtyRepoExtra {

}