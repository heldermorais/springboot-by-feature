package tcmpa.nie.byfeature.petclinic.owner;

import org.springframework.stereotype.Service;
import tcmpa.nie.byfeature.petclinic.common.services.AbstractCrudServices;
import tcmpa.nie.byfeature.petclinic.owner.persistence.OwnerRepository;

import java.util.Collection;
import java.util.List;


@Service
public class OwnerService extends AbstractCrudServices<OwnerRepository, Owner, Integer> implements OwnerUseCase {


    protected OwnerService(OwnerRepository repository) {
        super(repository);
    }


}
