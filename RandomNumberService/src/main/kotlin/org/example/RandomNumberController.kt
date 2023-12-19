package org.example

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import java.time.Instant
import kotlin.random.Random

@RestController
class RandomNumberController {


    @GetMapping("/randomNumber")
    fun getRandomNumber(): RandomNumber {
        val nextInt = Random.nextInt()
        println("Random number $nextInt generated at ${Instant.now()}")
        println()
        return RandomNumber(nextInt)
    }
}