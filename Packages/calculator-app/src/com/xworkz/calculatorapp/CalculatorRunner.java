package com.xworkz.calculatorapp;

import com.xworkz.calculatorapp.calcinfo.Calculator;

public class CalculatorRunner {
    public static void main(String[] args) {
        System.out.println("MAIN STARTED");

        Calculator calculator = new Calculator();

        calculator.setFirstNumber(25.0);
        double first = calculator.getFirstNumber();

        calculator.setSecondNumber(15.0);
        double second = calculator.getSecondNumber();

        calculator.setEqualsTo(first + second);  // Example: Addition
        double result = calculator.getEqualsTo();

        System.out.println("MAIN ENDED");
    }
}
