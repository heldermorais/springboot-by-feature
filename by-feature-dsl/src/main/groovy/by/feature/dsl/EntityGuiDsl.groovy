package by.feature.dsl

import groovy.util.logging.Slf4j


@Slf4j
class EntityGuiDsl {

    protected AlignmentEnum alignment

    protected Class entityClass

    protected EntityGuiDsl( Class entityClass ){
        this.entityClass = entityClass
    }

    static void entityGui ( Class entityClass , @DelegatesTo(value = EntityGuiDsl, strategy = Closure.DELEGATE_ONLY) Closure guiDef  ){

        EntityGuiDsl dsl = new EntityGuiDsl( entityClass )

        guiDef.delegate        = dsl
        guiDef.resolveStrategy = Closure.DELEGATE_ONLY

        guiDef.call()

    }


    void field (String fieldName, Closure fieldDef){

    }



}


enum AlignmentEnum {
    RIGHT, LEFT, CENTER;
}