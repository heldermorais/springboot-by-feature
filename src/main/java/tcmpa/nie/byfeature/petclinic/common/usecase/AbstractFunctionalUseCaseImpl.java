package tcmpa.nie.byfeature.petclinic.common.usecase;

import org.springframework.data.jpa.repository.JpaRepository;
import tcmpa.nie.byfeature.petclinic.common.usecase.jpa.AbstractJpaUseCaseImpl;

import java.util.function.Function;

public abstract class AbstractFunctionalUseCaseImpl<I,O> extends AbstractUseCaseImpl implements Function<I,O> {

}
