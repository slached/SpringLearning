package com.example.firstspringproject.services.impl

import com.example.firstspringproject.services.RedPrinter

class TurkishRedPrinter : RedPrinter {

    @Override
    override fun print(): String {
        return "kirmizi"
    }
}