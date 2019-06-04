package com.snail.designpatternlearning.SimpleFactoryMethod;

/**
 * @author created by Snail
 * date:2019/6/4
 * email:yuesnail@gmail.com
 */
public class Sub implements Operation {
    @Override
    public double getResult(double number1, double number2) {
        return number1 - number2;
    }
}
