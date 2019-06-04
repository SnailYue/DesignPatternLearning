package com.snail.designpatternlearning.SimpleFactoryMethod;

/**
 * @author created by Snail
 * date:2019/6/4
 * email:yuesnail@gmail.com
 */
public class Div implements Operation {
    @Override
    public double getResult(double number1, double number2) throws Exception {
        if (number2 == 0) {
            throw new Exception("除数不能为0");
        }
        return number1 / number2;
    }
}
