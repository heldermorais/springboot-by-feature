package tcmpa.nie.byfeature.petclinic.common.usecase.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import tcmpa.nie.byfeature.petclinic.common.usecase.jpa.readonly.IAllReadOnlyJpaUseCase;

public abstract class CrudJpaUseCaseImpl<U extends JpaRepository<T,ID>,T,ID> extends AbstractJpaUseCaseImpl<U,T,ID> implements IAllReadOnlyJpaUseCase<U,T,ID> {

    public CrudJpaUseCaseImpl(U repository) {
        super(repository);
    }


//    protected U repository;
//
//
//    public CrudUseCaseImpl(U repository) {
//        this.repository = repository;
//    }
//
//
//    public U getRepository() { return repository; }


}
