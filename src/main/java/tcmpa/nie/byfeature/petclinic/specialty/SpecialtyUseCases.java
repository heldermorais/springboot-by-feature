package tcmpa.nie.byfeature.petclinic.specialty;

import tcmpa.nie.byfeature.petclinic.common.usecase.persistence.CrudUseCase;

import java.util.Collection;

public interface SpecialtyUseCases extends CrudUseCase<Specialty, Integer> {

    Collection<Specialty> searchFor(String keyword);

}
