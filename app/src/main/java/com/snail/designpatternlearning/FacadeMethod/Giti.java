package com.snail.designpatternlearning.FacadeMethod;

import android.util.Log;

/**
 * @author created by Snail
 * date:2019/6/18
 * email:yuesnail@gmail.com
 */
public class Giti implements Tyre {
    private static final String TAG = "Giti";
    @Override
    public void roll() {
        Log.d(TAG, "roll: 使用佳通轮胎");
    }
}
