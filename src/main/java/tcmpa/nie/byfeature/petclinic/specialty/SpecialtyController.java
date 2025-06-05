package tcmpa.nie.byfeature.petclinic.specialty;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/specialty")
public class SpecialtyController {


    protected final ISpecialtyUseCases specialtyUseCases;


    public SpecialtyController(ISpecialtyUseCases specialtyUseCases) {
        this.specialtyUseCases = specialtyUseCases;
    }


    @GetMapping("/find-all")
    public Collection<Specialty> findAll() {
        return this.specialtyUseCases.findAll();
    }


    @GetMapping("/search-for")
    public Collection<Specialty> searchFor(@RequestParam("keyword") String keyword) {

        return this.specialtyUseCases.searchFor(keyword);

    }


}
