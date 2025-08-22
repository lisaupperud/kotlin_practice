package com.lisa.kotlin_practice

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotlinPracticeApplication

fun main(args: Array<String>) {
    // same as sout
    println("Hello World!")

    // Uppgift #2
    println("---- UPPGIFT #2 ----")
    val number: Int = 1
    val text: String = "String"
    val double: Double = 1.0
    val long: Long = 1L
    val bool: Boolean = true

    println("This is a number: $number This is a string: $text")
    println("This is a double: $double This is a long: $long This is a bool: $bool")

    // Uppgift #3
    println("---- UPPGIFT #3 ----")
    val myArray: Array<Int> = arrayOf(0, 2, 5) // regular array
    val myArrayList: ArrayList<Int> = ArrayList( // array list
        arrayListOf<Int>(10, 20, 30)
        )

    println("List last element in array: ${myArray[2]}")
    println("List last element in array list: ${myArrayList[2]}")

    // Uppgift #4
    println("---- UPPGIFT #4 ----")
    for (i in 0..25) println("Counts up: $i ") // counts up
    for (i in 20 downTo 5) println("Counts down: $i ") // counts down
    for (i in 0 .. 50 step 2) println("Counts every 2nd: $i ") // every 2nd
    for (item in myArray) println("Print array element: $item ") // prints every element in array

    // Uppgift #5
    println("---- UPPGIFT #5 ----")
    val anArray = IntArray(5) // sets an initial size -> all elements are automatically set to value '0'
    anArray[0] = 1
    anArray[1] = 2
    anArray[2] = 3
    anArray[3] = 4
    anArray[4] = 5

    println("Index 3 should have value 4")
    println("Index 3: Value: ${anArray[3]}")

	runApplication<KotlinPracticeApplication>(*args)
}
