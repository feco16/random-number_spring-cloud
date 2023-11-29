package org.example

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.client.loadbalancer.LoadBalanced
import org.springframework.context.annotation.Bean
import org.springframework.web.reactive.function.client.WebClient

@SpringBootApplication
class RandomNumberUiApplication {

    @Bean
    @LoadBalanced
    fun loadBalancedWebClientBuilder(): WebClient.Builder {
        return WebClient.builder()
    }

}

fun main(args: Array<String>) {
    runApplication<RandomNumberUiApplication>(*args)
}

