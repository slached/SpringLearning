package com.example.firstspringproject.services.impl

import com.example.firstspringproject.services.BluePrinter
import com.example.firstspringproject.services.ColourPrinter
import com.example.firstspringproject.services.GreenPrinter
import com.example.firstspringproject.services.RedPrinter

class ColourPrinterImpl : ColourPrinter {

    private lateinit var redPrinter: RedPrinter
    private lateinit var bluePrinter: BluePrinter
    private lateinit var greenPrinter: GreenPrinter

    fun ColourPrinterImpl() {
        this.redPrinter = EnglishRedPrinter()
        this.greenPrinter = EnglishGreenPrinter()
        this.bluePrinter = EnglishBluePrinter()
    }

    @Override
    override fun print(): String {
        return ""
    }

}