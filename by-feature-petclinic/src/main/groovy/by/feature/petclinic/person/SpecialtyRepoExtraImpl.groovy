package by.feature.petclinic.person

import groovy.util.logging.Slf4j
import org.springframework.transaction.annotation.Transactional

import javax.persistence.EntityManager

@Transactional
@Slf4j
class SpecialtyRepoExtraImpl implements SpecialtyRepoExtra {

    SpecialtyRepoExtraImpl() {

    }

    @Override
    void executeCustom() {

        log.info "  SpecialtyRepoExtraImpl.executeCustom()"

    }
}
