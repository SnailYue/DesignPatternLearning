package com.snail.designpatternlearning.ProxyMethod;

import android.util.Log;

/**
 * @author created by Snail
 * date:2019/6/25
 * email:yuesnail@gmail.com
 */
public class RealSubject implements ISubject{
    private final static String TAG = "RealSubject";

    @Override
    public void request() {
        Log.d(TAG, "request: request in RealSubject");
    }
}
