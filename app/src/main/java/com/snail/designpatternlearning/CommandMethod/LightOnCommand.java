package com.snail.designpatternlearning.CommandMethod;

/**
 * @author created by Snail
 * date:2019/6/26
 * email:yuesnail@gmail.com
 */
public class LightOnCommand implements Command {

    Light light;

    public LightOnCommand(Light _light) {
        this.light = _light;
    }

    @Override
    public void excute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}
