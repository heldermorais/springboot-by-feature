package tcmpa.nie.byfeature.petclinic.specialty.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import tcmpa.nie.byfeature.petclinic.specialty.Specialty;

import java.util.Collection;
import java.util.List;

public interface SpecialtyRepository extends JpaRepository<Specialty, Integer> {

    Collection<Specialty> findByNameContainsIgnoreCase(String name);

}