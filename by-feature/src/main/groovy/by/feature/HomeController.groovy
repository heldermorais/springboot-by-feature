package by.feature

import groovy.util.logging.Slf4j
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping


@Controller
@Slf4j
class HomeController {

    @GetMapping("/")
    String index(){
        log.debug "index() - BEGIN"

        log.debug "index() - END"

        return "home/index"
    }

}
