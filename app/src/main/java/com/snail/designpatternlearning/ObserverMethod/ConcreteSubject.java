package com.snail.designpatternlearning.ObserverMethod;

/**
 * @author created by Snail
 * date:2019/6/22
 * email:yuesnail@gmail.com
 */
public class ConcreteSubject extends Subject{
    private String state;

    public String getState(){
        return state;
    }

    public void change(String state){
        this.state = state;
        this.notifyObserver(this.state);
    }
}
