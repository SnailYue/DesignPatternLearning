package com.snail.designpatternlearning.MediatorMethod;

import android.util.Log;

/**
 * @author created by Snail
 * date:2019/6/20
 * email:yuesnail@gmail.com
 */
public class MusicDevice extends SmartDevice {
    private static final String TAG = "MusicDevice";

    @Override
    public void readyState(String instruction) {
        Log.d(TAG, "readyState: 音乐设备准备" + instruction);
    }

    @Override
    public void operateDevice(String instruction, SmartMediator mediator) {
        Log.d(TAG, "operateDevice: 音乐设备已" + instruction);
        mediator.curtain(instruction);
    }
}
