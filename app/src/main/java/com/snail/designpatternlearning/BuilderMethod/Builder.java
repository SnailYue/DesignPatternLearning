package com.snail.designpatternlearning.BuilderMethod;

/**
 * @author created by Snail
 * date:2019/5/28
 * email:yuesnail@gmail.com
 */
public abstract class Builder {
    abstract void buildCPU();
    abstract void buildGraphics();
    abstract void buildMainBoard();
    abstract void buildDisplay();
    abstract Computer buildComputer();
}
