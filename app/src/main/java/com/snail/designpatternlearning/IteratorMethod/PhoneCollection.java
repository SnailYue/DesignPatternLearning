package com.snail.designpatternlearning.IteratorMethod;

import java.util.ArrayList;
import java.util.List;

/**
 * @author created by Snail
 * date:2019/6/1
 * email:yuesnail@gmail.com
 */
public class PhoneCollection<T> implements Aggregate {

    private List<T> list = new ArrayList<>();

    public void add(T item){
        list.add(item);
    }

    public void remove(T item){
        list.remove(item);
    }

    @Override
    public Iterator iterator() {
        return new PhoneIterator(list) ;
    }
}
