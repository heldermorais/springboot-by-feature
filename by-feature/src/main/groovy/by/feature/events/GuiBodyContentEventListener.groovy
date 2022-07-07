package by.feature.events

import by.feature.gui.events.GuiRenderingEvent
import groovy.util.logging.Slf4j
import org.springframework.context.event.EventListener
import org.springframework.stereotype.Service


@Service
@Slf4j
class GuiBodyContentEventListener {

    @EventListener
    void onEvent ( GuiRenderingEvent event ){
        if (event.name.startsWithIgnoreCase("gui.")){
            log.debug "${event}"
            //event.setGuiOutput( "<h1> ... Escrevi aqui ... </h1>")
        }
    }
}
