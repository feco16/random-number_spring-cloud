package org.example

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.reactive.function.client.WebClient

@Controller
class DashboardController(
    private val webClientBuilder: WebClient.Builder
) {
    @RequestMapping("/dashboard")
    fun getRandomNumber(m: Model): String {
        val randomNumber = webClientBuilder.build().get()
            //				.uri("http://localhost:8082/randomNumber)
            .uri("http://RandomNumberService/randomNumber")
            .retrieve()
            .bodyToMono(RandomNumber::class.java)
            .block()
        println("Get random number!: $randomNumber")
        m.addAttribute("randomNumber", randomNumber)
        return "dashboard"
    }
}
