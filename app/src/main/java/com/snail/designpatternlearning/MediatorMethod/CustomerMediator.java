package com.snail.designpatternlearning.MediatorMethod;

/**
 * @author created by Snail
 * date:2019/6/20
 * email:yuesnail@gmail.com
 */
public class CustomerMediator extends SmartMediator {

    public CustomerMediator(SmartDevice db, SmartDevice md, SmartDevice cd) {
        super(db, md, cd);
    }

    @Override
    public void music(String instruction) {
        cd.readyState(instruction);
        bd.readyState(instruction);
    }

    @Override
    public void curtain(String instruction) {
        bd.readyState(instruction);
        md.readyState(instruction);
    }

    @Override
    public void bath(String instruction) {
        md.readyState(instruction);
        cd.readyState(instruction);
    }
}
