package tcmpa.nie.byfeature.petclinic.common.usecase.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

public class AbstractJpaUseCaseImpl<U extends JpaRepository<T,ID>,T,ID> implements IUseCaseWithRepository<U, T, ID> {

    private U repository;

    public AbstractJpaUseCaseImpl(U repository) {
        this.repository = repository;
    }

    @Override
    public U getRepository() {
        return this.repository;
    }

}
