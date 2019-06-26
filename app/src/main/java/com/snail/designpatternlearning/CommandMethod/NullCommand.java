package com.snail.designpatternlearning.CommandMethod;

import android.util.Log;

/**
 * @author created by Snail
 * date:2019/6/26
 * email:yuesnail@gmail.com
 */
public class NullCommand implements Command {
    private static final String TAG = "NullCommand";
    @Override
    public void excute() {
        Log.d(TAG, "excute: null Command");
    }

    @Override
    public void undo() {
        Log.d(TAG, "undo: null Command");
    }
}
