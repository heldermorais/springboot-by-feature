package tcmpa.nie.byfeature.petclinic.common.services;

import java.util.function.Function;

public abstract class AbstractFunctionalService<I,O> extends AbstractService implements Function<I,O> {

}
