package com.snail.designpatternlearning.FacadeMethod;

import android.util.Log;

/**
 * @author created by Snail
 * date:2019/6/18
 * email:yuesnail@gmail.com
 */
public class Michelin implements Tyre {
    private static final String TAG = "Michelin";
    @Override
    public void roll() {
        Log.d(TAG, "roll: 使用米其林轮胎");
    }
}
