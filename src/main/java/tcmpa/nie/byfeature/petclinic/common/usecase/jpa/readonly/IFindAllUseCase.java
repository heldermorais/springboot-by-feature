package tcmpa.nie.byfeature.petclinic.common.usecase.jpa.readonly;

import org.springframework.data.jpa.repository.JpaRepository;
import tcmpa.nie.byfeature.petclinic.common.usecase.jpa.IUseCaseWithRepository;

import java.util.Collection;

public interface IFindAllUseCase<U extends JpaRepository<T,ID>, T, ID> extends IUseCaseWithRepository<U, T, ID> {


    default Collection<T> findAll(){
        return getRepository().findAll();
    };


}
