package tcmpa.nie.byfeature.petclinic.common.services;

import org.springframework.data.jpa.repository.JpaRepository;
import tcmpa.nie.byfeature.petclinic.common.usecase.persistence.CrudUseCase;

import java.util.Collection;

public abstract class AbstractCrudServices<R extends JpaRepository<T,ID>, T , ID > implements CrudUseCase<T,ID> {


    protected final R repository;


    protected AbstractCrudServices(R repository) {
        this.repository = repository;
    }


    public R getRepository() {
        return repository;
    }


    @Override
    public Collection<T> findAll() {
        return this.getRepository().findAll();
    }

    @Override
    public T findById(ID id) {
        return this.getRepository().findById(id).orElse(null);
    }

    @Override
    public T save(T entity) throws RuntimeException {
        return this.getRepository().saveAndFlush(entity);
    }

    @Override
    public void deleteById(ID id) throws RuntimeException {
        this.getRepository().deleteById(id);
    }

    @Override
    public void deleteAll(Collection<T> entities) throws RuntimeException {
        this.getRepository().deleteAll(entities);
    }

}
