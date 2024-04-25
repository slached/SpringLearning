package com.example.firstspringproject.conf

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.context.annotation.Configuration


@Configuration
@ConfigurationProperties(prefix = "pizza")
class PizzaConfig {
    var crust : String?=null
    var topping : String?=null
    var sauce : String?=null

}