package com.lisa.kotlin_practice.example

class Variables {
    // 'val' vs 'var'
    val aString: String = "This is a string" // val == final/const
    var age: Int = 1 // var == general variable

    // Int
    val a: Int = 1 // explicitly typed
    val b = 21 // type inferred

    // String
    /*
    * concat == sammanfogning av strängar
    * ${} == indikerar metodanrop
    * name.substring() <-- starting point for the string
    */

    fun variables(){
        val name = "John"
        val lastName = "Smith"
        val result = "My name is: $name $lastName"
        val otherText = "My name is: ${name.substring(2)}"

        val text = """
        First line
        Second line
        Third line
                """.trimIndent()
        print("$name $lastName $result $otherText $text")
    }









}