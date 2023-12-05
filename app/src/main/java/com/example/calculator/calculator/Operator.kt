package com.example.calculator.calculator

class Operator(private var operator: AbstractOperation)  {

    fun operate(num1:Number,num2:Number):Number {
        return operator.operate(num1,num2)
    }

}