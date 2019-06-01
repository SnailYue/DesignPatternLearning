package com.snail.designpatternlearning.IteratorMethod;

/**
 * @author created by Snail
 * date:2019/6/1
 * email:yuesnail@gmail.com
 */
public interface Iterator<T> {
    boolean hasNext();
    T next();
}
