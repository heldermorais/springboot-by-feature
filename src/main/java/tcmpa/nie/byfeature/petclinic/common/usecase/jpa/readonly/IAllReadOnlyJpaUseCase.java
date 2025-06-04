package tcmpa.nie.byfeature.petclinic.common.usecase.jpa.readonly;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IAllReadOnlyJpaUseCase<U extends JpaRepository<T,ID>, T, ID> extends IFindAllUseCase<U, T, ID>, IFindByIdUseCase<U, T, ID> {

//
//    U getRepository();
//

//
//    default Collection<T> findAll(){
//        return getRepository().findAll();
//    };


//    default T findById(ID id) {
//        return getRepository().findById(id).orElse(null);
//    };


}