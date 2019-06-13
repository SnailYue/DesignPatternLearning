package com.snail.designpatternlearning.DecoratorMethod;

/**
 * @author created by Snail
 * date:2019/6/13
 * email:yuesnail@gmail.com
 */
public abstract class MilkTeaMaterial implements MilkTea {

    public MilkTea milkTea;

    public MilkTeaMaterial(MilkTea milkTea) {
        this.milkTea = milkTea;
    }

    @Override
    public float getTotalPrice() {
        return milkTea.getTotalPrice();
    }

    @Override
    public String getMaterial() {
        return milkTea.getMaterial();
    }
}
