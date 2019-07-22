package com.snail.designpatternlearning.StateMethod;


import android.util.Log;

/**
 * @author created by Snail
 * date:2019/6/24
 * email:yuesnail@gmail.com
 */
public class NightState implements State {
    private static final String TAG = NightState.class.getSimpleName();
    private static NightState instance;

    public synchronized static NightState getInstance() {
        if (null == instance) {
            instance = new NightState();
        }
        return instance;
    }

    public NightState() {

    }

    @Override
    public void doClock(Context context, int hour) {
        if (hour >= 9 || 17 < hour) {
            context.changeState(DayState.getInstance());
        }
    }

    @Override
    public void doUse(Context context) {
        Log.d(TAG, "doUse: 注意，晚上使用库房");
    }

    @Override
    public void doAlarm(Context context) {
        Log.d(TAG, "doAlarm: 晚上按下警铃");
    }

    @Override
    public void doPhone(Context context) {
        Log.d(TAG, "doPhone: 晚上通话留言");
    }
}
