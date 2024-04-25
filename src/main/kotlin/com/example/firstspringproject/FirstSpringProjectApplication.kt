package com.example.firstspringproject

import com.example.firstspringproject.conf.PizzaConfig
import org.slf4j.LoggerFactory
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication


@SpringBootApplication
class FirstSpringProjectApplication(var pizzaConfig: PizzaConfig) : CommandLineRunner {
    override fun run(vararg args: String?) {
        val log = LoggerFactory.getLogger(this::class.java)
        log.info(pizzaConfig.crust)
    }
}

fun main(args: Array<String>) {
    runApplication<FirstSpringProjectApplication>(*args)
}



