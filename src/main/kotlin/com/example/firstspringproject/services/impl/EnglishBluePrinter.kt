package com.example.firstspringproject.services.impl

import com.example.firstspringproject.services.BluePrinter

class EnglishBluePrinter : BluePrinter {

    @Override
    override fun print(): String {
        return "Blue"
    }
}