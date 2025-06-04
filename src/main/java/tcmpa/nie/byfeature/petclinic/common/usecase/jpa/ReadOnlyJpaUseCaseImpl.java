package tcmpa.nie.byfeature.petclinic.common.usecase.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import tcmpa.nie.byfeature.petclinic.common.usecase.jpa.readonly.IAllReadOnlyJpaUseCase;

public abstract class ReadOnlyJpaUseCaseImpl<U extends JpaRepository<T,ID>,T,ID> extends AbstractJpaUseCaseImpl<U, T, ID> implements IAllReadOnlyJpaUseCase<U, T, ID> {

    public ReadOnlyJpaUseCaseImpl(U repository) {
        super(repository);
    }

}
