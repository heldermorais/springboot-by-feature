package tcmpa.nie.byfeature.petclinic.pet.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import tcmpa.nie.byfeature.petclinic.pet.Visit;

public interface VisitRepository extends JpaRepository<Visit, Integer> {
}