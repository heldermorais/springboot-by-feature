package by.feature.common.events


import groovy.util.logging.Slf4j
import org.springframework.beans.BeansException
import org.springframework.context.ApplicationContext
import org.springframework.context.ApplicationContextAware
import org.springframework.context.event.EventListener
import org.springframework.stereotype.Service


@Service
@Slf4j
class HookEventsService {


    protected ApplicationContext applicationContext


    HookEventsService(ApplicationContext applicationContext) {
       this.applicationContext = applicationContext
    }


    void executeHook( String hookName ) {

        HexaGenericEvent event = HexaGenericEvent.builderWith().name(hookName).source(this.applicationContext).build()

        this.applicationContext.publishEvent(event)

    }

    HexaGenericEvent executeHookAndReturn( String hookName ) {

        HexaGenericEvent event = HexaGenericEvent.builderWith().name(hookName).source(this.applicationContext).build()

        this.applicationContext.publishEvent(event)

        return event

    }


    void executeHook( String hookName , Map<String,Object> context ) {

        HexaGenericEvent event = HexaGenericEvent.builder().name(hookName).source(this.applicationContext).context( context ).build()

        this.applicationContext.publishEvent(event)

    }


    HexaGenericEvent executeHookAndReturn( String hookName , Map<String,Object> context ) {

        HexaGenericEvent event = HexaGenericEvent.builder().name(hookName).source(this.applicationContext).context( context ).build()

        this.applicationContext.publishEvent(event)

        return event

    }

    HexaGenericEvent executeHookAndReturn( HexaGenericEvent event , Map<String,Object> context ) {

        event.context.putAll(context)

        this.applicationContext.publishEvent(event)

        return event

    }

    HexaGenericEvent executeHookAndReturn( HexaGenericEvent event  ) {

        this.applicationContext.publishEvent(event)

        return event

    }




//    @EventListener
//    void onEveryEvent (HexaGenericEvent event){
//         log.debug " ... evento : ${event.name} type: ${event.class.name}"
//    }


}
