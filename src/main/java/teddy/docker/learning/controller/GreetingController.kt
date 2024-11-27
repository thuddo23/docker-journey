package teddy.docker.learning.controller

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/greeting")
class GreetingController {

    val randomInstanceId = (0..10).random()
    @RequestMapping
    fun greeting(): String {
        return "This is Greeting Service running on instance $randomInstanceId"
    }
}