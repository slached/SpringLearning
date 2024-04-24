package com.example.firstspringproject.services.impl

import com.example.firstspringproject.services.GreenPrinter

class TurkishGreenPrinter : GreenPrinter {

    @Override
    override fun print(): String {
        return "yeşil"
    }
}