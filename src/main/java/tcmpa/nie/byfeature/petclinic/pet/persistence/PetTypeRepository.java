package tcmpa.nie.byfeature.petclinic.pet.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import tcmpa.nie.byfeature.petclinic.pet.PetType;

public interface PetTypeRepository extends JpaRepository<PetType, Integer> {
}