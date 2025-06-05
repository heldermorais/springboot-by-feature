package tcmpa.nie.byfeature.petclinic.common.usecase.persistence;

import tcmpa.nie.byfeature.petclinic.common.usecase.IUseCase;

import java.util.Collection;

public interface ICrudUseCase<T,ID> extends IUseCase {

    Collection<T> findAll();

    T findById(ID id);



    T save(T entity) throws RuntimeException;



    void deleteById(ID id) throws RuntimeException;

    void deleteAll(Collection<T> entities) throws RuntimeException;

}
