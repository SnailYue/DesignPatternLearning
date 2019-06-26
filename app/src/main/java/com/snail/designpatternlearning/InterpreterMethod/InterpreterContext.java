package com.snail.designpatternlearning.InterpreterMethod;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/**
 * @author created by Snail
 * date:2019/6/26
 * email:yuesnail@gmail.com
 */
public class InterpreterContext {
    private ConcurrentMap map = new ConcurrentHashMap();

    public void assign(Variable variable, boolean value) {
        map.put(variable, new Boolean(value));
    }

    public boolean lookup(Variable variable) throws IllegalAccessException {
        Boolean value = (Boolean) map.get(variable);
        if (null == value) {
            throw new IllegalAccessException();
        }
        return value.booleanValue();
    }
}
