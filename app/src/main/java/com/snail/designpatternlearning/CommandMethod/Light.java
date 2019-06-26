package com.snail.designpatternlearning.CommandMethod;

import android.util.Log;

/**
 * @author created by Snail
 * date:2019/6/26
 * email:yuesnail@gmail.com
 */
public class Light {
    private static final String TAG = "Light"; 
    public void on() {
        Log.d(TAG, "on: ");   
    }
    
    public void off(){
        Log.d(TAG, "off: ");
    }
}
