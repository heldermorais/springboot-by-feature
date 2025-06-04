package tcmpa.nie.byfeature.petclinic.vet.specialty.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import tcmpa.nie.byfeature.petclinic.vet.specialty.model.Specialty;

import java.util.Collection;

public interface SpecialtyRepository extends JpaRepository<Specialty, Integer> {
    Collection<Specialty> findAllByNameContaining(String name);
}