package com.snail.designpatternlearning.BridgeMethod;

import android.util.Log;

/**
 * @author created by Snail
 * date:2019/6/10
 * email:yuesnail@gmail.com
 */
public class MessageEmail implements MessageImpl {
    private static final String TAG = "MessageEmail";
    @Override
    public void send(Message message) {
        Log.d(TAG, "send: system Email message " + message);
    }
}
