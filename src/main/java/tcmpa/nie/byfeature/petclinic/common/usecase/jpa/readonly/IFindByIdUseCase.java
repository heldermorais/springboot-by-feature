package tcmpa.nie.byfeature.petclinic.common.usecase.jpa.readonly;

import org.springframework.data.jpa.repository.JpaRepository;
import tcmpa.nie.byfeature.petclinic.common.usecase.jpa.IUseCaseWithRepository;

public interface IFindByIdUseCase<U extends JpaRepository<T,ID>, T, ID> extends IUseCaseWithRepository<U, T, ID> {

    default T findById(ID id) {
        return getRepository().findById(id).orElse(null);
    };

}
