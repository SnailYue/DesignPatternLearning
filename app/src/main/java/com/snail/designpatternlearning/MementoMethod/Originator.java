package com.snail.designpatternlearning.MementoMethod;

/**
 * @author created by Snail
 * date:2019/6/23
 * email:yuesnail@gmail.com
 */
public class Originator {
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String _state){
        this.state = _state;
    }

    public Memento createMemento(){
        return new Memento(state);
    }

    public void resetMemento(Memento _memento){
        setState(_memento.getStats());
    }

}
