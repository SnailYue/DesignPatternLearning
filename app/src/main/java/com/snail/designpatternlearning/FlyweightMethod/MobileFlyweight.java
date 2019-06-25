package com.snail.designpatternlearning.FlyweightMethod;

import android.util.Log;

/**
 * @author created by Snail
 * date:2019/6/25
 * email:yuesnail@gmail.com
 */
public class MobileFlyweight extends Flyweight{
    private final static String TAG = "MobileFlyweight";
    public MobileFlyweight(String _extrinsic) {
        super(_extrinsic);
    }

    @Override
    public void operate() {
        Log.d(TAG, "operate: mobile");
    }
}
