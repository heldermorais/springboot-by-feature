package tcmpa.nie.byfeature.petclinic.common.controllers;


import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import tcmpa.nie.byfeature.petclinic.common.usecase.persistence.CrudUseCase;
import tcmpa.nie.byfeature.petclinic.specialty.Specialty;

import java.util.Collection;

public class AbstractCrudController <U extends CrudUseCase<T,ID>, T, ID > {

    protected final U useCase;

    public AbstractCrudController(U useCase) {
        this.useCase = useCase;
    }

    @GetMapping("/")
    public Collection<T> findAll() {
        return this.useCase.findAll();
    }

    @GetMapping("/{id}")
    @ApiResponses(value = {
            @io.swagger.v3.oas.annotations.responses.ApiResponse(responseCode = "200", description = "Found the entity"),
            @io.swagger.v3.oas.annotations.responses.ApiResponse(responseCode = "404", description = "Entity not found", content = @io.swagger.v3.oas.annotations.media.Content(examples = @io.swagger.v3.oas.annotations.media.ExampleObject(value = "{}"))),
    })
    public T findById(@PathVariable("id") ID id){
        return this.useCase.findById(id);
    }



}
