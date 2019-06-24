package com.snail.designpatternlearning.StateMethod;


/**
 * @author created by Snail
 * date:2019/6/24
 * email:yuesnail@gmail.com
 */
public class DayState implements State{
    private static DayState instance;

    public synchronized static DayState getInstance(){
        if (null == instance){
            instance = new DayState();
        }
        return instance;
    }

    public DayState(){

    }

    @Override
    public void doClock(Context context, int hour) {
        if (hour < 9 || 17 <= hour){
            context.changeState(NightState.getInstance());
        }
    }

    @Override
    public void doUse(Context context) {
        context.recordLog("使用库房");
    }

    @Override
    public void doAlarm(Context context) {
        context.callSecurityCenter("白天按下警铃");
    }

    @Override
    public void doPhone(Context context) {
        context.callSecurityCenter("白天正常通话");
    }
}
