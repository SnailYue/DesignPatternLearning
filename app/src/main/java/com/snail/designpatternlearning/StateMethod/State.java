package com.snail.designpatternlearning.StateMethod;


/**
 * @author created by Snail
 * date:2019/6/24
 * email:yuesnail@gmail.com
 */
public interface State {
    void doClock(Context context,int hour);
    void doUse(Context context);
    void doAlarm(Context context);
    void doPhone(Context context);
}
