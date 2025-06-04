package tcmpa.nie.byfeature.petclinic.common.usecase.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import tcmpa.nie.byfeature.petclinic.common.usecase.IUseCase;

public interface IUseCaseWithRepository<U extends JpaRepository<T,ID>, T, ID> extends IUseCase {

    U getRepository();

}
