package com.snail.designpatternlearning.ProxyMethod;

import android.util.Log;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author created by Snail
 * date:2019/6/25
 * email:yuesnail@gmail.com
 */
public class DynamicProxy {
    private final static String TAG = "DynamicProxy";

    public DynamicProxy() {
    }

    public static <T> T getProxySubject() {
        final ISubject subject = new RealSubject();
        ISubject dynamicProxy = (ISubject) Proxy.newProxyInstance(subject.getClass().getClassLoader(), new Class[]{ISubject.class}, new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                Object result = method.invoke(subject, args);
                return result;
            }
        });
        return (T) dynamicProxy;
    }
}
