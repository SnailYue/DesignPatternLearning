package com.snail.designpatternlearning.MediatorMethod;

/**
 * @author created by Snail
 * date:2019/6/20
 * email:yuesnail@gmail.com
 */
public abstract class SmartMediator {
    SmartDevice bd;
    SmartDevice md;
    SmartDevice cd;

    public SmartMediator(SmartDevice bd, SmartDevice md, SmartDevice cd){
        super();
        this.bd = bd;
        this.md = md;
        this.cd = cd;
    }

    public abstract void music(String instruction);
    public abstract void curtain(String instruction);
    public abstract void bath(String instruction);
}
