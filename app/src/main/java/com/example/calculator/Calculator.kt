package com.example.calculator

class Calculator(operator:AbstractOperation)  {
    private var operator:AbstractOperation

    init {
        this.operator = operator
    }

    fun operate(num1:Number,num2:Number):Number {
        return operator.operate(num1,num2)
    }

}