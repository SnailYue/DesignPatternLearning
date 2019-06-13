package com.snail.designpatternlearning.DecoratorMethod;

/**
 * @author created by Snail
 * date:2019/6/13
 * email:yuesnail@gmail.com
 */
public class Pudding extends MilkTeaMaterial {

    public Pudding(MilkTea milkTea) {
        super(milkTea);
    }

    @Override
    public float getTotalPrice() {
        return super.getTotalPrice() + 2;
    }

    @Override
    public String getMaterial() {
        return super.getMaterial() + "添加了: 布丁";
    }

}
