package com.example.firstspringproject.services.impl

import com.example.firstspringproject.services.GreenPrinter
import org.springframework.stereotype.Component

@Component
class EnglishGreenPrinter : GreenPrinter {

    @Override
    override fun print(): String {
        return "Green"
    }
}