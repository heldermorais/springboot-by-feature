package by.feature

import groovy.util.logging.Slf4j
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional


@Service
@Slf4j
@Transactional
class HomeService {
    String greetings (){
       return "Hello World !"
    }
}
