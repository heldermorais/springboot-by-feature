package tcmpa.nie.byfeature.petclinic.vet.specialty;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import tcmpa.nie.byfeature.petclinic.vet.specialty.model.Specialty;

import java.util.Collection;

@RestController("/specialties")
public class SpecialtyController {

    protected final SpecialtyOneMoreUseCase specialtyOneMoreUseCase;
    protected final SpecialtyCrudUseCases specialtyCrudUseCases;

    public SpecialtyController(SpecialtyOneMoreUseCase specialtyOneMoreUseCase, SpecialtyCrudUseCases specialtyCrudUseCases) {
        this.specialtyOneMoreUseCase = specialtyOneMoreUseCase;
        this.specialtyCrudUseCases = specialtyCrudUseCases;
    }


    @GetMapping("/search-for")
    public Collection<Specialty> searchFor(@RequestParam("keyword") String keyword) {

        return this.specialtyCrudUseCases.doThatThing(keyword);

    }


}
