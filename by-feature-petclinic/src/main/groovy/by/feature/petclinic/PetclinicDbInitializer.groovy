package by.feature.petclinic

import by.feature.petclinic.person.Specialty
import by.feature.petclinic.person.SpecialtyRepository
import by.feature.petclinic.pet.PetType
import by.feature.petclinic.pet.PetTypeRepository
import groovy.util.logging.Slf4j
import org.springframework.boot.ApplicationArguments
import org.springframework.boot.ApplicationRunner
import org.springframework.stereotype.Service


@Slf4j
@Service
class PetclinicDbInitializer implements ApplicationRunner {


    protected PetTypeRepository petTypeRepository
    protected SpecialtyRepository specialtyRepository

    PetclinicDbInitializer(PetTypeRepository petTypeRepository,SpecialtyRepository specialtyRepository) {
        this.petTypeRepository = petTypeRepository
        this.specialtyRepository = specialtyRepository
    }



    @Override
    void run(ApplicationArguments args) throws Exception {
        log.info "run() - BEGIN"

        initPetTypes()
        callHelloWorld()

        initSpecialities()

        log.info "run() - END"
    }

    protected void initPetTypes() {

        log.info "initPetTypes() - BEGIN"

        int count = this.petTypeRepository.count()
        if(count <= 0) {
            ArrayList<PetType> petTypes = new ArrayList<PetType>()
            petTypes.add(new PetType(name: "Cat"))
            petTypes.add(new PetType(name: "Dog"))
            petTypes.add(new PetType(name: "Fish"))
            petTypes.add(new PetType(name: "Bird"))
            petTypes.add(new PetType(name: "Lizzard"))
            petTypes.add(new PetType(name: "Snake"))

            this.petTypeRepository.saveAll(petTypes)
        }else{
            log.info "initPetTypes() - by passing ..."
        }
        log.info "initPetTypes() - END"
    }


    void callHelloWorld() {

        log.info "callHelloWorld() - BEGIN"

        this.petTypeRepository.updateVeryComplicated(null )

        log.info "callHelloWorld() - END"
    }


    void initSpecialities() {

        ArrayList<Specialty> specialties = new ArrayList<Specialty>()
        specialties.add( new Specialty(name: "Clinic"))
        specialties.add( new Specialty(name: "Gastro"))
        specialties.add( new Specialty(name: "Oftalmo"))

        this.specialtyRepository.saveAll(specialties)

        this.specialtyRepository.executeCustom()

    }
}
