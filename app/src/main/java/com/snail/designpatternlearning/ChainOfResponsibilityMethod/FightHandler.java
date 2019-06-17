package com.snail.designpatternlearning.ChainOfResponsibilityMethod;

/**
 * @author created by Snail
 * date:2019/6/17
 * email:yuesnail@gmail.com
 */
public abstract class FightHandler {
    protected FightHandler successor;

    public void setSuccessor(FightHandler successor) {
        this.successor = successor;
    }

    public FightHandler getSuccessor() {
        return successor;
    }

    public abstract void fightWith(Protagonist protagonist);
}
