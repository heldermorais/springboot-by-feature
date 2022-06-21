package by.feature

import groovy.util.logging.Slf4j
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.servlet.ModelAndView

@Controller
@Slf4j
class HomeController {



    @GetMapping("/")
    ModelAndView index(Model model){
        log.debug "index() - BEGIN"
        model.addAttribute("greetings", "Hello from Springboot <strong>Controller</strong>!")
        log.debug "index() - END"

        return new ModelAndView("/home/index", model )
    }




}
