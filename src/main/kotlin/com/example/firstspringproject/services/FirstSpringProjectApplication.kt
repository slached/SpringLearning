package com.example.firstspringproject.services

import org.slf4j.LoggerFactory
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication


@SpringBootApplication
class FirstSpringProjectApplication(colourPrinter: ColourPrinter) : CommandLineRunner {

    private var colourPrinter: ColourPrinter = colourPrinter

    override fun run(vararg args: String?) {
        val log = LoggerFactory.getLogger(this::class.java)
        log.info(colourPrinter.print())
    }
}

fun main(args: Array<String>) {
    runApplication<FirstSpringProjectApplication>(*args)
}



