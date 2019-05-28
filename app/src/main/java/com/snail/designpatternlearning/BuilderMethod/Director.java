package com.snail.designpatternlearning.BuilderMethod;

/**
 * @author created by Snail
 * date:2019/5/28
 * email:yuesnail@gmail.com
 */
public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public Computer construct() {
        builder.buildCPU();
        builder.buildGraphics();
        builder.buildMainBoard();
        builder.buildDisplay();
        return builder.buildComputer();
    }
}
