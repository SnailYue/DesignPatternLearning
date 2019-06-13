package com.snail.designpatternlearning.DecoratorMethod;

/**
 * @author created by Snail
 * date:2019/6/13
 * email:yuesnail@gmail.com
 */
public class Bubble extends MilkTeaMaterial {

    public Bubble(MilkTea milkTea) {
        super(milkTea);
    }

    @Override
    public float getTotalPrice() {
        return super.getTotalPrice() + 5;
    }

    @Override
    public String getMaterial() {
        return super.getMaterial() + "添加了: 珍珠";
    }

}
