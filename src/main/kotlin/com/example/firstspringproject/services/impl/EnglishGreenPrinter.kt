package com.example.firstspringproject.services.impl

import com.example.firstspringproject.services.GreenPrinter

class EnglishGreenPrinter : GreenPrinter {

    @Override
    override fun print(): String {
        return "Green"
    }
}