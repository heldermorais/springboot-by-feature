package tcmpa.nie.byfeature.petclinic.specialty;

import org.springframework.stereotype.Service;
import tcmpa.nie.byfeature.petclinic.common.services.AbstractCrudServices;
import tcmpa.nie.byfeature.petclinic.specialty.persistence.SpecialtyRepository;

import java.util.Collection;


@Service
public class SpecialtyServices extends AbstractCrudServices<SpecialtyRepository, Specialty, Integer> implements ISpecialtyUseCases {


    public SpecialtyServices(SpecialtyRepository repository) {
        super(repository);
    }


    @Override
    public Collection<Specialty> searchFor(String keyword) {
        return this.repository.findByNameContainsIgnoreCase(keyword);
    }


}
