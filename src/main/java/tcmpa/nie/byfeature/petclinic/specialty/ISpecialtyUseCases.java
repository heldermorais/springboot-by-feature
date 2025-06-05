package tcmpa.nie.byfeature.petclinic.specialty;

import org.springframework.web.bind.annotation.RequestParam;
import tcmpa.nie.byfeature.petclinic.common.usecase.persistence.ICrudUseCase;

import java.util.Collection;

public interface ISpecialtyUseCases extends ICrudUseCase<Specialty, Integer> {

    Collection<Specialty> searchFor(String keyword);

}
