package com.example.calculator

class SubstractOperation:AbstractOperation {

    override fun operate(num1: Number, num2: Number):Number{
        return num1.toDouble() - num2.toDouble()
    }

}