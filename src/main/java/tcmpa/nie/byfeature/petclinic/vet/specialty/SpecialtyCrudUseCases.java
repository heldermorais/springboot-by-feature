package tcmpa.nie.byfeature.petclinic.vet.specialty;

import tcmpa.nie.byfeature.petclinic.common.UseCase;
import tcmpa.nie.byfeature.petclinic.common.usecase.jpa.CrudJpaUseCaseImpl;
import tcmpa.nie.byfeature.petclinic.vet.specialty.internal.Specialty;
import tcmpa.nie.byfeature.petclinic.vet.specialty.internal.SpecialtyRepository;

import java.util.Collection;


@UseCase
public class SpecialtyCrudUseCases extends CrudJpaUseCaseImpl<SpecialtyRepository, Specialty, Integer> {

    public SpecialtyCrudUseCases(SpecialtyRepository repository) {
        super(repository);
    }


    public Collection<Specialty> doThatThing (String keyword){
        return this.getRepository().findAllByNameContaining(keyword);
    }

}
