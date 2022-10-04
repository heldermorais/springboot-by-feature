package by.feature.petclinic.pet.extra

import by.feature.petclinic.pet.PetType
import groovy.util.logging.Slf4j
import org.springframework.jdbc.core.JdbcTemplate
import org.springframework.stereotype.Component
import org.springframework.transaction.annotation.Transactional

@Slf4j
@Transactional
@Component
class PetTypeRepoExtrasImpl implements PetTypeRepoExtras {

    protected JdbcTemplate jdbcTemplate

    PetTypeRepoExtrasImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate
    }

    @Override
    void updateVeryComplicated(PetType petType) {
        log.warn " PetTypeRepoExtras.hello() - executing ... "
        //this.jdbcTemplate.
    }

}
