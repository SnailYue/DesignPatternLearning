package com.snail.designpatternlearning.MementoMethod;

/**
 * @author created by Snail
 * date:2019/6/23
 * email:yuesnail@gmail.com
 */
public class Caretaker {
    private Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }

}
