package org.example

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication


@SpringBootApplication
class RandomNumberService

fun main(args: Array<String>) {
    runApplication<RandomNumberService>(*args)
}
