package by.feature

import groovy.util.logging.Slf4j
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import spock.lang.Specification


@SpringBootTest
@Slf4j
class HomeControllerSpec extends Specification {

    protected HomeController homeController

    void setup(HomeController homeController){
        this.homeController = homeController
    }

    //@Autowired (required = false)
    //protected HomeController homeController


    def "when context is loaded then all expected beans are created"() {
        //given:
        when:
            homeController != null

        then:
            homeController


        //homeController
    }

}
