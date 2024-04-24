package com.example.firstspringproject.services.impl

import com.example.firstspringproject.services.BluePrinter
import org.springframework.stereotype.Component

@Component
class EnglishBluePrinter : BluePrinter {

    @Override
    override fun print(): String {
        return "Blue"
    }
}