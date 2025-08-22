package com.lisa.kotlin_practice.controller

import com.lisa.kotlin_practice.service.CalculatorService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class CalculatorController {

    val service: CalculatorService = CalculatorService()

    @GetMapping("/add/{a}/{b}")
    fun add(@PathVariable a: Int, @PathVariable b: Int): String {
        return "$a + $b is: ${service.add(a, b)}"
    }

    @GetMapping("/subtract/{a}/{b}")
    fun subtract(@PathVariable a: Int, @PathVariable b: Int): String {
        return "$a - $b is: ${service.subtract(a, b)}"
    }

    @GetMapping("/multiply/{a}/{b}")
    fun multiply(@PathVariable a: Int, @PathVariable b: Int): String {
        return "$a * $b is: ${service.multiply(a, b)}"
    }

    @GetMapping("/divide/{a}/{b}")
    fun divide(@PathVariable a: Int, @PathVariable b: Int): String {
        return "$a / $b is: ${service.divide(a, b)}"
    }

}