package by.feature

import groovy.util.logging.Slf4j
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping


@Controller
@Slf4j
class HomeController {

    protected HomeService homeService

    HomeController ( HomeService homeService ){
        this.homeService = homeService
    }

    @GetMapping("/")
    String index(){
        log.debug "index() - BEGIN"

        log.debug "index() - END"

        return "home/index"
    }

}
