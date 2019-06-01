package com.snail.designpatternlearning.IteratorMethod;

import java.util.List;

/**
 * @author created by Snail
 * date:2019/6/1
 * email:yuesnail@gmail.com
 */
public class PhoneIterator<T> implements Iterator {


    private List<T> bookList;

    private int index;

    public PhoneIterator(List<T> list) {
        this.bookList = list;
    }

    @Override
    public boolean hasNext() {
        return index < bookList.size();
    }

    @Override
    public T next() {
        T item = bookList.get(index);
        index++;
        return item;
    }
}
