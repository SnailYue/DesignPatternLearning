package com.snail.designpatternlearning.ProxyMethod;

import android.util.Log;

/**
 * @author created by Snail
 * date:2019/6/25
 * email:yuesnail@gmail.com
 */
public class StaticProxy implements ISubject{
    private final static String TAG = "StaticProxy";
    private ISubject subject;

    public StaticProxy(){
        this.subject = new RealSubject();
    }

    @Override
    public void request() {
        Log.d(TAG, "proxy start");
        this.subject.request();
        Log.d(TAG, "request: end");
    }
}
