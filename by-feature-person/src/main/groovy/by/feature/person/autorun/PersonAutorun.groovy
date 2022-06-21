package by.feature.person.autorun

import by.feature.person.model.Speciality
import by.feature.person.model.SpecialityDataServices
import by.feature.person.model.Vet
import by.feature.person.model.VetDataServices
import groovy.util.logging.Slf4j
import org.springframework.boot.ApplicationArguments
import org.springframework.boot.ApplicationRunner
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
@Slf4j
class PersonAutorun implements ApplicationRunner {

    protected SpecialityDataServices specialityDataServices
    protected VetDataServices vetDataServices

    PersonAutorun(SpecialityDataServices specialityDataServices, VetDataServices vetDataServices){

        this.specialityDataServices = specialityDataServices
        this.vetDataServices        = vetDataServices

        log.debug "PersonAutorun - CREATED"
    }


    @Override
    void run(ApplicationArguments args) throws Exception {
        log.debug "PersonAutorun.run - BEGIN"

        initSpeciality()
        initVet()

        log.debug "PersonAutorun.run - END"
    }



    @Transactional
    protected void initSpeciality() {

        log.debug "PersonAutorun.initDB : [Speciality]"

        Speciality special = new Speciality()
        special.setName("Dermatology")
        specialityDataServices.save(special)

        special = new Speciality()
        special.setName("Odontology")
        specialityDataServices.save(special)

        special = new Speciality()
        special.setName("Oftalmology")
        specialityDataServices.save(special)

        log.debug "PersonAutorun.initDB : [Speciality]. Done"
    }


    @Transactional
    protected void initVet() {
        log.debug "PersonAutorun.initDB : [Vet]"

        Vet vet1 = new Vet()
        vet1.setFirstName("Aaa")
        vet1.setLastName(".a.a.a")
        vet1.addSpecialty( specialityDataServices.findByNameLike("Odontology") )
        vet1.addSpecialty( specialityDataServices.findByNameLike("Dermato%") )
        this.vetDataServices.save(vet1)

        vet1 = new Vet()
        vet1.setFirstName("Bbb")
        vet1.setLastName(".b.b.b")
        //vet1.addSpecialty( specialityDataServices.findByNameLike("Odontology") )
        //vet1.addSpecialty( specialityDataServices.findByNameLike("Dermato%") )
        this.vetDataServices.save(vet1)

        vet1 = new Vet()
        vet1.setFirstName("Ccc")
        vet1.setLastName(".c.c.c")
        //vet1.addSpecialty( specialityDataServices.findByNameLike("Odontology") )
        vet1.addSpecialty( specialityDataServices.findByNameLike("Dermato%") )
        this.vetDataServices.save(vet1)

        vet1 = new Vet()
        vet1.setFirstName("Ddd")
        vet1.setLastName(".d.d.d")
        vet1.addSpecialty( specialityDataServices.findByNameLike("Odontology") )
        //vet1.addSpecialty( specialityDataServices.findByNameLike("Dermato%") )
        this.vetDataServices.save(vet1)

        log.debug "PersonAutorun.initDB : [Vet]. Done"
    }
}
