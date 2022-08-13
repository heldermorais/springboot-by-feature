package by.feature.gui.pebble.ext

import by.feature.common.events.HookEventsService
import by.feature.gui.events.GuiRenderingEvent
import com.mitchellbosecke.pebble.node.BlockNode
import com.mitchellbosecke.pebble.node.BodyNode
import com.mitchellbosecke.pebble.template.EvaluationContextImpl
import com.mitchellbosecke.pebble.template.PebbleTemplateImpl

class HookedBlockNode extends BlockNode {

    protected HookEventsService hookEventsService

    HookedBlockNode(int lineNumber, String name, HookEventsService hookEventsService) {
        super(lineNumber, name)
        this.hookEventsService = hookEventsService
    }

    HookedBlockNode(int lineNumber, String name, BodyNode body, HookEventsService hookEventsService) {
        super(lineNumber, name, body)

        this.hookEventsService = hookEventsService
    }


    @Override
    public void render(final PebbleTemplateImpl self, Writer writer, EvaluationContextImpl context)
            throws IOException {

        String tagOutput = ""
        StringWriter sw = new StringWriter()

        //self.block(writer, context, this.name, false);
        self.block(sw, context, this.name, false)

        tagOutput = sw.toString()


        Map<String,Object> eventcontext = new HashMap()
        //eventcontext.putAll(context)

        eventcontext.put ("gui2BeRendered", tagOutput)

        //Map<String,Object> renderingContext = new HashMap()
        //renderingContext.put('unrenderedBody', body)
        //renderingContext.put('renderedBody'  , body())

        //context.put("gui.tag.rendering", renderingContext)
        //context.put( "gui.output", body() )

        GuiRenderingEvent event = GuiRenderingEvent.builder()
                .name("gui.block.${this.name}")
                .source(this)
                .context(eventcontext)
                .build()

        event.setGuiOutput(null)
        //def event = hookEventsService.executeHookAndReturn( attrs.hookName , context )

        event = hookEventsService.executeHookAndReturn( event )

        //renderingContext = event.context."gui.tag.rendering"
        //def tagOutput = event.getGuiOutput() == null ? body() : event.getGuiOutput()

        writer.write( tagOutput )

    }

}
