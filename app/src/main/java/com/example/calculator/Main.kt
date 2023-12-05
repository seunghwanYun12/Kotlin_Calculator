package com.example.calculator

fun main() {
    var num1 = 100
    var num2 = 30

    var addCalculator = Calculator(AddOperation())
    var subCalculator = Calculator(SubstractOperation())
    var divCalculator = Calculator(DivideOperation())
    var mulCalculator = Calculator(MultiplyOperation())


    println("$num1 + $num2 = ${addCalculator.operate(num1, num2)}")
    println("$num1 - $num2 = ${subCalculator.operate(num1, num2)}")
    println("$num1 * $num2 = ${divCalculator.operate(num1, num2)}")
    println("$num1 / $num2 = ${mulCalculator.operate(num1, num2)}")


}
