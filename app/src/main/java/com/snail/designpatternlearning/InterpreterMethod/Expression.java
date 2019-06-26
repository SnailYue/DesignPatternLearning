package com.snail.designpatternlearning.InterpreterMethod;

import android.support.annotation.NonNull;

/**
 * @author created by Snail
 * date:2019/6/26
 * email:yuesnail@gmail.com
 */
public interface Expression {
    boolean interpret(InterpreterContext context);
    @Override
    boolean equals(Object o);
    @Override
    int hashCode();
    @Override
    @NonNull
    String toString();
}
