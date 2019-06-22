package com.snail.designpatternlearning.ObserverMethod;

import java.util.ArrayList;
import java.util.List;

/**
 * @author created by Snail
 * date:2019/6/22
 * email:yuesnail@gmail.com
 */
public abstract class Subject {
    private List<Observer> list = new ArrayList<>();

    public void attach(Observer observer) {
        this.list.add(observer);
    }

    public void detach(Observer observer) {
        this.list.remove(observer);
    }

    public void notifyObserver(String state) {
        for (Observer observer : list) {
            observer.update(state);
        }
    }
}
