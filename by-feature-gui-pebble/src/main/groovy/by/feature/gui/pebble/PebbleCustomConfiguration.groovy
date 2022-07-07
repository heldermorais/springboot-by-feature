package by.feature.gui.pebble

import by.feature.common.events.HookEventsService
import com.mitchellbosecke.pebble.PebbleEngine
import com.mitchellbosecke.pebble.attributes.methodaccess.MethodAccessValidator
import com.mitchellbosecke.pebble.boot.autoconfigure.PebbleProperties
import com.mitchellbosecke.pebble.extension.Extension
import com.mitchellbosecke.pebble.loader.Loader
import com.mitchellbosecke.pebble.spring.extension.SpringExtension
import org.springframework.context.MessageSource
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.lang.Nullable

@Configuration(proxyBeanMethods = false)
class PebbleCustomConfiguration {

    @Bean
    public SpringExtension springExtension(MessageSource messageSource, HookEventsService hookEventsService) {
        return new CustomPebbleSpringExtension(messageSource, hookEventsService);
    }


    @Bean
    public PebbleEngine pebbleEngine(PebbleProperties properties,
                                     Loader<?> pebbleLoader,
                                     SpringExtension springExtension,
                                     @Nullable List<Extension> extensions,
                                     @Nullable MethodAccessValidator methodAccessValidator) {

        PebbleEngine.Builder builder = new PebbleEngine.Builder();

        builder.loader(pebbleLoader);

        builder.extension(springExtension);

        if (extensions != null && !extensions.isEmpty()) {
            builder.extension(extensions.toArray(new Extension[extensions.size()]));
        }

        if (!properties.isCache()) {
            builder.cacheActive(false);
        }

        if (properties.getDefaultLocale() != null) {
            builder.defaultLocale(properties.getDefaultLocale());
        }

        builder.strictVariables(properties.isStrictVariables());

        builder.greedyMatchMethod(properties.isGreedyMatchMethod());

        if (methodAccessValidator != null) {
            builder.methodAccessValidator(methodAccessValidator);
        }

        return builder.build();

    }
}


