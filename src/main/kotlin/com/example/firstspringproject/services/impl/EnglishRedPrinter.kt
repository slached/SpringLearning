package com.example.firstspringproject.services.impl

import com.example.firstspringproject.services.RedPrinter

class EnglishRedPrinter : RedPrinter {

    @Override
    override fun print(): String {
        return "Red"
    }
}