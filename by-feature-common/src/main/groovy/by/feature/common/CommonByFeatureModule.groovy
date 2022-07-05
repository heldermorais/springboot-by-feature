package by.feature.common

import by.feature.common.events.HookEventsService
import groovy.util.logging.Slf4j
import org.springframework.boot.ApplicationArguments
import org.springframework.boot.ApplicationRunner
import org.springframework.stereotype.Service

@Service
@Slf4j
class CommonByFeatureModule implements ApplicationRunner {

    protected HookEventsService hookEventsService

    CommonByFeatureModule( HookEventsService hookEventsService ){
        log.debug "CommonByFeatureModule - CREATED"
        this.hookEventsService = hookEventsService
    }



    @Override
    void run(ApplicationArguments args) throws Exception {
        log.debug "CommonByFeatureModule.run(...) - BEGIN"

        //hookEventsService.executeHookAndReturn( new GuiRenderingEvent(this) )

        hookEventsService.executeHook("common.application.initialized")

//        GuiRenderingEvent ev2 = new GuiRenderingEvent(this,"gui.initialized")
//        hookEventsService.executeHookAndReturn(ev2)
//
//        GuiRenderingEvent ev3 = new GuiRenderingEvent(this,"gui.main-page.displaying")
//        hookEventsService.executeHookAndReturn(ev3)

        log.debug "CommonByFeatureModule.run(...) - END"
    }

}
