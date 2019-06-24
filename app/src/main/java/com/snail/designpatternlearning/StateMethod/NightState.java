package com.snail.designpatternlearning.StateMethod;


/**
 * @author created by Snail
 * date:2019/6/24
 * email:yuesnail@gmail.com
 */
public class NightState implements State{
    private static NightState instance;

    public synchronized static NightState getInstance(){
        if (null == instance){
            instance = new NightState();
        }
        return instance;
    }

    public NightState(){

    }

    @Override
    public void doClock(Context context, int hour) {
        if (hour >= 9 || 17 < hour){
            context.changeState(DayState.getInstance());
        }
    }

    @Override
    public void doUse(Context context) {
        context.callSecurityCenter("注意，晚上使用库房");
    }

    @Override
    public void doAlarm(Context context) {
        context.callSecurityCenter("晚上按下警铃");
    }

    @Override
    public void doPhone(Context context) {
        context.callSecurityCenter("晚上通话留言");
    }
}
