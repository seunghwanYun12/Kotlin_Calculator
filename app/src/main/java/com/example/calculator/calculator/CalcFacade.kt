package com.example.calculator.calculator

import com.example.calculator.main.Calculator
import com.example.calculator.operation.AddOperation
import com.example.calculator.operation.DivideOperation
import com.example.calculator.operation.MultiplyOperation
import com.example.calculator.operation.SubstractOperation

class CalcFacade : Calculator {

    private var addCalculatorImpl = CalculatorImpl(AddOperation())
    private var subCalculatorImpl = CalculatorImpl(SubstractOperation())
    private var divCalculatorImpl = CalculatorImpl(DivideOperation())
    private var mulCalculatorImpl = CalculatorImpl(MultiplyOperation())

    override fun add(num1: Number, num2:Number) : Number{
        return addCalculatorImpl.operate(num1, num2)
    }
    override fun sub(num1: Number, num2:Number) : Number{
        return subCalculatorImpl.operate(num1, num2)
    }
    override fun div(num1: Number, num2:Number) : Number{
        return divCalculatorImpl.operate(num1, num2)
    }
    override fun mul(num1: Number, num2:Number) : Number{
        return mulCalculatorImpl.operate(num1, num2)
    }


}