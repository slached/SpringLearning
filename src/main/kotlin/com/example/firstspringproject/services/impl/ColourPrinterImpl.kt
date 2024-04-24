package com.example.firstspringproject.services.impl

import com.example.firstspringproject.services.BluePrinter
import com.example.firstspringproject.services.ColourPrinter
import com.example.firstspringproject.services.GreenPrinter
import com.example.firstspringproject.services.RedPrinter

class ColourPrinterImpl(redPrinter: RedPrinter, greenPrinter: GreenPrinter, bluePrinter: BluePrinter) :
    ColourPrinter {

    private var redPrinter: RedPrinter = redPrinter
    private var bluePrinter: BluePrinter = bluePrinter
    private var greenPrinter: GreenPrinter = greenPrinter

    @Override
    override fun print(): String {
        return "${this.redPrinter.print()} ${this.bluePrinter.print()} ${this.greenPrinter.print()}"
    }

}