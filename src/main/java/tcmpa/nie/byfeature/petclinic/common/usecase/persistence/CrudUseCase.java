package tcmpa.nie.byfeature.petclinic.common.usecase.persistence;

import tcmpa.nie.byfeature.petclinic.common.usecase.UseCase;

import java.util.Collection;

public interface CrudUseCase<T,ID> extends UseCase {

    Collection<T> findAll();

    T findById(ID id);



    T save(T entity) throws RuntimeException;



    void deleteById(ID id) throws RuntimeException;

    void deleteAll(Collection<T> entities) throws RuntimeException;

}
