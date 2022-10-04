package by.feature.petclinic.pet

import by.feature.petclinic.pet.extra.PetTypeRepoExtras
import org.springframework.data.repository.CrudRepository

interface PetTypeRepository extends CrudRepository<PetType, Integer>, PetTypeRepoExtras {

}