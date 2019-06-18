package com.snail.designpatternlearning.FacadeMethod;

import android.util.Log;

/**
 * @author created by Snail
 * date:2019/6/18
 * email:yuesnail@gmail.com
 */
public class Benz implements Engine{
   private static final String TAG = "Benz";
    @Override
    public void startUp() {
        Log.d(TAG, "startUp: 发动奔驰引擎");
    }
}
