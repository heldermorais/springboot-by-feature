package tcmpa.nie.byfeature.petclinic.specialty;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/specialty")
@Tag(name = "Specialty", description = "Specialty management operations")
public class SpecialtyController {


    protected final SpecialtyUseCases specialtyUseCases;


    public SpecialtyController(SpecialtyUseCases specialtyUseCases) {
        this.specialtyUseCases = specialtyUseCases;
    }


    @GetMapping("/")
    @Operation(summary = "Find all specialties", description = "Retrieves all specialties from the system")
    public Collection<Specialty> findAll() {
        return this.specialtyUseCases.findAll();
    }


    @GetMapping("/search-for")
    public Collection<Specialty> searchFor(@RequestParam("keyword") String keyword) {

        return this.specialtyUseCases.searchFor(keyword);

    }


}
