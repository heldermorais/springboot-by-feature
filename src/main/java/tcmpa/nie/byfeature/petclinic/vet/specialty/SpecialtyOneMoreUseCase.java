package tcmpa.nie.byfeature.petclinic.vet.specialty;

import org.springframework.stereotype.Service;
import tcmpa.nie.byfeature.petclinic.common.UseCase;
import tcmpa.nie.byfeature.petclinic.common.usecase.AbstractFunctionalUseCaseImpl;


@UseCase
public class SpecialtyOneMoreUseCase extends AbstractFunctionalUseCaseImpl<String, Void> {

    @Override
    public Void apply(String input) {
        // Implement the logic for this use case here
        // For example, you might want to log the input or perform some action
        System.out.println("Processing input: " + input);
        return null; // Return appropriate value if needed
    }

}
