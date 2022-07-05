package by.feature.events

import by.feature.common.events.HexaGenericEvent
import groovy.util.logging.Slf4j
import org.springframework.context.event.EventListener
import org.springframework.core.annotation.Order
import org.springframework.stereotype.Service

@Slf4j
@Service
class HiEveryone {

    @EventListener(HexaGenericEvent)
    @Order(100)
    void hello(){
        log.debug " Hello everyOne !"
    }

}
