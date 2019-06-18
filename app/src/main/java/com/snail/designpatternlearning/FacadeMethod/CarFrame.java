package com.snail.designpatternlearning.FacadeMethod;

/**
 * @author created by Snail
 * date:2019/6/18
 * email:yuesnail@gmail.com
 */
public class CarFrame {
    private Engine engine;
    private Tyre tyre;

    public CarFrame(Engine engine, Tyre tyre) {
        this.engine = engine;
        this.tyre = tyre;
    }

    public void drive() {
        startUp();
        rolll();
    }

    private void startUp(){
        engine.startUp();
    }

    private void rolll(){
        tyre.roll();
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void setTyre(Tyre tyre) {
        this.tyre = tyre;
    }
}
