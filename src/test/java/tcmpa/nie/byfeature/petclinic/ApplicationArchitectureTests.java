package tcmpa.nie.byfeature.petclinic;


import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;
//import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.modulith.core.ApplicationModules;
import org.springframework.modulith.docs.Documenter;


//@SpringBootTest
public class ApplicationArchitectureTests {

    @Test
    void checkArchitecture() {

        var modules = ApplicationModules.of(PetclinicByFeatureApplication.class).verify();

        new Documenter(modules) // Documenter is used to generate documentation for the modules
                .writeDocumentation()
                .writeModulesAsPlantUml()
                .writeIndividualModulesAsPlantUml();

        Assert.isTrue(true, "Architecture is ok for now");
    }

}
