package com.snail.designpatternlearning.SimpleFactoryMethod;

/**
 * @author created by Snail
 * date:2019/6/4
 * email:yuesnail@gmail.com
 */
public class EasyFactory {
    public static Operation createOperation(String name){
        Operation operation = null;
        switch (name){
            case "+":
                operation = new Add();
                break;
            case "-":
                operation = new Sub();
                break;
            case "*":
                operation = new Mul();
                break;
            case "/":
                operation = new Div();
                break;
        }
        return operation;
    }
}
