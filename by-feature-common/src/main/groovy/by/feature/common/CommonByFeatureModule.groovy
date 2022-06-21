package by.feature.common

import groovy.util.logging.Slf4j
import org.springframework.boot.ApplicationArguments
import org.springframework.boot.ApplicationRunner
import org.springframework.stereotype.Service

@Service
@Slf4j
class CommonByFeatureModule implements ApplicationRunner {



    CommonByFeatureModule(){
        log.debug "CommonByFeatureModule - CREATED"
    }



    @Override
    void run(ApplicationArguments args) throws Exception {
        log.debug "CommonByFeatureModule.run(...) - BEGIN"

        log.debug "CommonByFeatureModule.run(...) - END"
    }

}
