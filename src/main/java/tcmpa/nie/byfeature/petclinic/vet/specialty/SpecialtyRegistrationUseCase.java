package tcmpa.nie.byfeature.petclinic.vet.specialty;

import tcmpa.nie.byfeature.petclinic.common.UseCase;
import tcmpa.nie.byfeature.petclinic.common.usecase.jpa.AbstractJpaUseCaseImpl;
import tcmpa.nie.byfeature.petclinic.vet.specialty.model.Specialty;
import tcmpa.nie.byfeature.petclinic.vet.specialty.persistence.SpecialtyRepository;


@UseCase
public class SpecialtyRegistrationUseCase extends AbstractJpaUseCaseImpl<SpecialtyRepository, Specialty, Integer> {

    public SpecialtyRegistrationUseCase(SpecialtyRepository repository) {
        super(repository);
    }

    public Specialty registerNewSpecialty(String specialtyName, String description) {

        Specialty specialty = new Specialty();
        specialty.setName(specialtyName);

        return getRepository().save(specialty);

    }


}
