package com.example.firstspringproject.services

import com.example.firstspringproject.services.impl.ColourPrinterImpl
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication


@SpringBootApplication
class FirstSpringProjectApplication

fun main(args: Array<String>) {
    runApplication<FirstSpringProjectApplication>(*args)
}

fun run(args: Array<String>) {
    var colourPrinter: ColourPrinter = ColourPrinterImpl()
}



