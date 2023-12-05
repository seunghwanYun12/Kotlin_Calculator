package com.example.calculator.calculator

class Operator(operator: AbstractOperation)  {
    private var operator: AbstractOperation

    init {
        this.operator = operator
    }

    fun operate(num1:Number,num2:Number):Number {
        return operator.operate(num1,num2)
    }

}