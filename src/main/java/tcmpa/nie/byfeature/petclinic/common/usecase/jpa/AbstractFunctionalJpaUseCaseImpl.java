package tcmpa.nie.byfeature.petclinic.common.usecase.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.function.Function;

public abstract class AbstractFunctionalJpaUseCaseImpl<I,O,U extends JpaRepository<T,ID>,T,ID> extends AbstractJpaUseCaseImpl<U,T,ID> implements Function<I,O> {

    public AbstractFunctionalJpaUseCaseImpl(U repository) {
        super(repository);
    }

}
