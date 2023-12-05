package com.example.calculator.main

import com.example.calculator.calculator.CalculatorImpl

fun main() {
    var num1 = 100
    var num2 = 30

    var calculator = CalculatorImpl()

    println("$num1 + $num2 = ${calculator.add(num1, num2)}")
    println("$num1 - $num2 = ${calculator.sub(num1, num2)}")
    println("$num1 * $num2 = ${calculator.mul(num1, num2)}")
    println("$num1 / $num2 = ${calculator.div(num1, num2)}")

}
