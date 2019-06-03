package com.snail.designpatternlearning.TemplateMethod;

/**
 * @author created by Snail
 * date:2019/6/3
 * email:yuesnail@gmail.com
 */
public abstract class CarTemplate {
    abstract void makeEngine();
    abstract void makeBody();
    abstract void makeWheel();
    abstract void showCarInfo();
    public final void buildCar(){
        makeEngine();
        makeBody();
        makeWheel();
        showCarInfo();
    }
}
