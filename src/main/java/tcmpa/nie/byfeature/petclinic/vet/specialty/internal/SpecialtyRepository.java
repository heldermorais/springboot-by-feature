package tcmpa.nie.byfeature.petclinic.vet.specialty.internal;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;

public interface SpecialtyRepository extends JpaRepository<Specialty, Integer> {
    Collection<Specialty> findAllByNameContaining(String name);
}