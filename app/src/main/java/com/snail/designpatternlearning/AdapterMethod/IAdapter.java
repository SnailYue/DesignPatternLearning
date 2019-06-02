package com.snail.designpatternlearning.AdapterMethod;

/**
 * @author created by Snail
 * date:2019/6/2
 * email:yuesnail@gmail.com
 */
public interface IAdapter<T> {
    T transform(T data);
}
