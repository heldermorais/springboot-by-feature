package by.feature.person.model

import org.springframework.data.repository.CrudRepository


interface SpecialityDataServices extends CrudRepository<Speciality, Long>{

    Speciality findByNameLike( String name )

}
