package org.example

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import kotlin.random.Random

@RestController
class RandomNumberController {


    @GetMapping("/randomNumber")
    fun getRandomNumber(): RandomNumber {
        println("Random number requested")
        return RandomNumber(Random.nextInt())
    }
}