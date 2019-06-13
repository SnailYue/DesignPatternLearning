package com.snail.designpatternlearning.DecoratorMethod;

/**
 * @author created by Snail
 * date:2019/6/13
 * email:yuesnail@gmail.com
 */
public class CaremeMilkTea implements MilkTea {
    @Override
    public float getTotalPrice() {
        return 20;
    }

    @Override
    public String getMaterial() {
        return "焦糖奶茶";
    }
}
