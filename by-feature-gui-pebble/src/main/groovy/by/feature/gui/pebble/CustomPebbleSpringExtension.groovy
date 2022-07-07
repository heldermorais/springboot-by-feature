package by.feature.gui.pebble

import by.feature.common.events.HookEventsService
import com.mitchellbosecke.pebble.spring.extension.SpringExtension
import com.mitchellbosecke.pebble.tokenParser.TokenParser
import groovy.util.logging.Slf4j
import org.springframework.context.MessageSource


@Slf4j
class CustomPebbleSpringExtension extends SpringExtension {

    protected HookEventsService hookEventsService

    CustomPebbleSpringExtension(MessageSource messageSource, HookEventsService hookEventsService) {

        super(messageSource)
        this.hookEventsService = hookEventsService
        log.debug "CustomPebbleSpringExtension - CREATED"

    }

    @Override
    List<TokenParser> getTokenParsers() {
        List<TokenParser> tp = new ArrayList<TokenParser>()
        tp.add ( new HookBlockTokenParser( this.hookEventsService ) )
        //if()
        //tp.addAll( super.getTokenParsers() )
        return tp
    }
}
