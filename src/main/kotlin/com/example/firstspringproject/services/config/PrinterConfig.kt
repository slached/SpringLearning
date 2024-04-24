package com.example.firstspringproject.services.config

import com.example.firstspringproject.services.BluePrinter
import com.example.firstspringproject.services.ColourPrinter
import com.example.firstspringproject.services.GreenPrinter
import com.example.firstspringproject.services.RedPrinter
import com.example.firstspringproject.services.impl.*

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class PrinterConfig {

    @Bean
    fun bluePrinter(): BluePrinter {
        return TurkishBluePrinter()
    }

    @Bean
    fun greenPrinter(): GreenPrinter {
        return TurkishGreenPrinter()
    }

    @Bean
    fun redPrinter(): RedPrinter {
        return TurkishRedPrinter()
    }

    @Bean
    fun colourPrinter(bluePrinter: BluePrinter, redPrinter: RedPrinter, greenPrinter: GreenPrinter): ColourPrinter {
        return ColourPrinterImpl(redPrinter, greenPrinter, bluePrinter)
    }

}