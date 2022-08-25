package by.feature.petclinic

import by.feature.ast.common.GuiEntity
import groovy.util.logging.Slf4j


@Slf4j
class ExecuteMe {

    static void main(String[] args) {
        ExecuteMe me = new ExecuteMe()
        me.helloWorld()
    }


    @GuiEntity
    void helloWorld(){
        log.info "Começou ..."

        log.info "Fim ..."
    }

}
