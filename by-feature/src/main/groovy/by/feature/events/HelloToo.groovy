package by.feature.events


import by.feature.common.events.adapter.HookEventListenerAdapter
import by.feature.gui.events.GuiRenderingEvent
import groovy.util.logging.Slf4j
import org.springframework.core.annotation.Order
import org.springframework.stereotype.Service

@Slf4j
@Service
@Order(101)
class HelloToo extends HookEventListenerAdapter<GuiRenderingEvent> {

    HelloToo() {
        super("gui.initialized")
    }

    @Override
    protected void onEventTriggered(GuiRenderingEvent event) {
        log.debug " Aha! gui event triggered ${event}"
    }

}
