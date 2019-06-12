package com.snail.designpatternlearning.CompositeMethod;


/**
 * @author created by Snail
 * date:2019/6/12
 * email:yuesnail@gmail.com
 */
public abstract class Entry {
    public abstract String getName();

    public abstract int getSize();

    public void printList() {
        printList("");
    }

    public Entry add(Entry entry){
      return this;
    }

    public abstract void printList(String prefix);

    @Override
    public String toString() {
        return getName() + "(" + getSize() + ")";
    }
}
