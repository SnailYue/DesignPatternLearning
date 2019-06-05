package com.snail.designpatternlearning.PrototypeMethod;

/**
 * @author created by Snail
 * date:2019/6/5
 * email:yuesnail@gmail.com
 */
public abstract class ElectronicsProduct implements Cloneable {

    public abstract void makeProduct(String s);
    abstract ElectronicsProduct createClone();
}
