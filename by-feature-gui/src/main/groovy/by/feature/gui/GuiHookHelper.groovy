package by.feature.gui

import by.feature.common.events.HookEventsService
import by.feature.gui.events.GuiRenderingEvent
import groovy.util.logging.Slf4j
import org.springframework.stereotype.Service


@Service
@Slf4j
class GuiHookHelper {


    protected HookEventsService hookEventsService


    GuiHookHelper( HookEventsService hookEventsService ){
       this.hookEventsService = hookEventsService
    }


    void executeHook ( String hookName, Map<String, Object> attrs ) {

        Map<String,Object> context = new HashMap()
        context.putAll(attrs)

        //GuiRenderingEvent event = new GuiRenderingEvent( this, hookName, attrs )

        GuiRenderingEvent event = GuiRenderingEvent.builder()
                .name(hookName)
                .source(this)
                .context(context)
                .build()

        event.setGuiOutput(null)

        hookEventsService.executeHookAndReturn( event )

    }

    void executeHook ( String hookName ) {
        executeHook( hookName , Collections.emptyMap() )
    }

    GuiRenderingEvent executeHookAndReturn ( String hookName, Map<String, Object> attrs ) {

        Map<String,Object> context = new HashMap()
        context.putAll(attrs)

        //GuiRenderingEvent event = new GuiRenderingEvent( this, hookName, attrs )
        GuiRenderingEvent event = GuiRenderingEvent.builder()
                .name(hookName)
                .source(this)
                .context(context)
                .build()

        event.setGuiOutput(null)

        hookEventsService.executeHookAndReturn( event )

        return event

    }

    GuiRenderingEvent executeHookAndReturn ( String hookName ) {
        return executeHookAndReturn( hookName, Collections.emptyMap() )
    }


    GuiRenderingEvent renderWithHook ( String hookName, Map<String, Object> attrs ) {
        //out << body() << (attrs.happy == 'true' ? " :-)" : " :-(")

        Map<String,Object> context = new HashMap()
        context.putAll(attrs)

        //Map<String,Object> renderingContext = new HashMap()
        //renderingContext.put('unrenderedBody', body)
        //renderingContext.put('renderedBody'  , body())

        //context.put("gui.tag.rendering", renderingContext)
        //context.put( "gui.output", body() )

        GuiRenderingEvent event = GuiRenderingEvent.builder()
                .name(hookName)
                .source(this)
                .context(context)
                .build()

        event.setGuiOutput(null)

        //def event = hookEventsService.executeHookAndReturn( attrs.hookName , context )

        event = hookEventsService.executeHookAndReturn( event )

//        //renderingContext = event.context."gui.tag.rendering"
//        def tagOutput = event.getGuiOutput() == null ? body() : event.getGuiOutput()
//
//        //out << renderingContext.renderedBody
//        out << tagOutput

        return event
    }

}
