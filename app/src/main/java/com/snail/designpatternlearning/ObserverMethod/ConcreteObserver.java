package com.snail.designpatternlearning.ObserverMethod;

import android.util.Log;

/**
 * @author created by Snail
 * date:2019/6/22
 * email:yuesnail@gmail.com
 */
public class ConcreteObserver implements Observer {

    private static final String TAG = "ConcreteObserver";
    @Override
    public void update(String state) {
        Log.d(TAG, "update: " + state);
    }
}
