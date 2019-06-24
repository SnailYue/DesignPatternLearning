package com.snail.designpatternlearning.StateMethod;

/**
 * @author created by Snail
 * date:2019/6/24
 * email:yuesnail@gmail.com
 */
public class SafeHome implements Context{
    private State state = DayState.getInstance();

    @Override
    public void setLock(int hour) {
        state.doClock(this,hour);
    }

    @Override
    public void changeState(State state) {
        this.state = state;
    }

    @Override
    public void callSecurityCenter(String msg) {
        state.doPhone(this);
    }

    @Override
    public void recordLog(String msg) {
        state.doUse(this);
    }

}
