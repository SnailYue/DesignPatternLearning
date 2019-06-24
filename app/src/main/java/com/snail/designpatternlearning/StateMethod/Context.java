package com.snail.designpatternlearning.StateMethod;

/**
 * @author created by Snail
 * date:2019/6/24
 * email:yuesnail@gmail.com
 */
public interface Context {
    void setLock(int hour);
    void changeState(State state);
    void callSecurityCenter(String msg);
    void recordLog(String msg);
}
