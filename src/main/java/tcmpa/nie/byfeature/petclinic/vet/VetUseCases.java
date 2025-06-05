package tcmpa.nie.byfeature.petclinic.vet;

import tcmpa.nie.byfeature.petclinic.common.usecase.persistence.CrudUseCase;

import java.util.Collection;



public interface VetUseCases extends CrudUseCase<Vet, Integer> {


    Collection<Vet> findBySpecialty(String specialtyName);


}
