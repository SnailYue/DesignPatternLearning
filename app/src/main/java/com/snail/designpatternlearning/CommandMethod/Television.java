package com.snail.designpatternlearning.CommandMethod;

import android.util.Log;

/**
 * @author created by Snail
 * date:2019/6/26
 * email:yuesnail@gmail.com
 */
public class Television {
    private static final String TAG = "Television";
    public void onTelevision() {
        Log.d(TAG, "on: ");   
    }
    
    public void offTelevision(){
        Log.d(TAG, "off: ");
    }
}
