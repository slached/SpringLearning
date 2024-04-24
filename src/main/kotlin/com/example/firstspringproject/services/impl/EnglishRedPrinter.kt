package com.example.firstspringproject.services.impl

import com.example.firstspringproject.services.RedPrinter
import org.springframework.stereotype.Component

@Component
class EnglishRedPrinter : RedPrinter {

    @Override
    override fun print(): String {
        return "Red"
    }
}