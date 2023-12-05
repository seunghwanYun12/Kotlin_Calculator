package com.example.calculator.calculator

import com.example.calculator.main.Calculator
import com.example.calculator.operation.AddOperation
import com.example.calculator.operation.DivideOperation
import com.example.calculator.operation.MultiplyOperation
import com.example.calculator.operation.SubstractOperation

class CalculatorImpl : Calculator {

    private var addOperator = Operator(AddOperation())
    private var subOperator = Operator(SubstractOperation())
    private var divOperator = Operator(DivideOperation())
    private var mulOperator = Operator(MultiplyOperation())

    override fun add(num1: Number, num2:Number) : Number{
        return addOperator.operate(num1, num2)
    }
    override fun sub(num1: Number, num2:Number) : Number{
        return subOperator.operate(num1, num2)
    }
    override fun div(num1: Number, num2:Number) : Number{
        return divOperator.operate(num1, num2)
    }
    override fun mul(num1: Number, num2:Number) : Number{
        return mulOperator.operate(num1, num2)
    }


}