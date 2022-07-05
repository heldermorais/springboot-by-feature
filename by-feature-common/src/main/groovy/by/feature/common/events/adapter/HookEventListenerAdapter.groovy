package by.feature.common.events.adapter

import by.feature.common.events.HexaGenericEvent
import org.springframework.context.ApplicationListener


class HookEventListenerAdapter<E extends HexaGenericEvent> implements ApplicationListener<E> {

    protected String hookEventPattern

    HookEventListenerAdapter(String hookEventPattern ){
        this.hookEventPattern = hookEventPattern
    }

    @Override
    void onApplicationEvent(E event) {

        if(willExecuteOnHook(event)){
          onEventTriggered(event)
        }

    }

    protected boolean willExecuteOnHook ( E event ){
        return event.name.startsWithIgnoreCase(this.hookEventPattern)
    }

    protected void onEventTriggered ( E event ){

    }

}
