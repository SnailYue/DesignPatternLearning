package com.snail.designpatternlearning.MediatorMethod;

/**
 * @author created by Snail
 * date:2019/6/20
 * email:yuesnail@gmail.com
 */
public abstract class SmartDevice {
    public abstract void readyState(String instruction);
    public abstract void operateDevice(String instruction,SmartMediator mediator);
}
