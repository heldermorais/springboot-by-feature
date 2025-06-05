package tcmpa.nie.byfeature.petclinic.vet;

import org.springframework.stereotype.Service;
import tcmpa.nie.byfeature.petclinic.common.services.AbstractCrudServices;
import tcmpa.nie.byfeature.petclinic.specialty.Specialty;
import tcmpa.nie.byfeature.petclinic.specialty.SpecialtyUseCases;
import tcmpa.nie.byfeature.petclinic.specialty.persistence.SpecialtyRepository;
import tcmpa.nie.byfeature.petclinic.vet.persistence.VetRepository;

import java.util.Collection;
import java.util.List;


@Service
public class VetService extends AbstractCrudServices<VetRepository, Vet, Integer> implements VetUseCases {


    protected VetService(VetRepository repository) {
        super(repository);
    }


    @Override
    public Collection<Vet> findBySpecialty(String specialtyName) {
        return this.getRepository().findBySpecialties_NameContainsIgnoreCase(specialtyName);
    }

}
