package by.feature.petclinic.pet.extra

import by.feature.petclinic.pet.PetType
import groovy.util.logging.Slf4j
import org.springframework.data.repository.CrudRepository
import org.springframework.data.repository.NoRepositoryBean
import org.springframework.transaction.annotation.Transactional

interface PetTypeRepoExtras {

    void updateVeryComplicated(PetType petType)

}