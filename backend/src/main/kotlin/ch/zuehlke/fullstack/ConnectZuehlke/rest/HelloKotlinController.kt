package ch.zuehlke.fullstack.ConnectZuehlke.rest

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloKotlinController {

    @GetMapping("/api/hello-kotlin")
    fun hello(): String {
        return "Hello Kotlin"
    }

}