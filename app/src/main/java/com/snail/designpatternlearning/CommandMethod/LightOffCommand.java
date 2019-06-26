package com.snail.designpatternlearning.CommandMethod;

/**
 * @author created by Snail
 * date:2019/6/26
 * email:yuesnail@gmail.com
 */
public class LightOffCommand implements Command {

    Light light;

    public LightOffCommand(Light _light) {
        this.light = _light;
    }

    @Override
    public void excute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }
}
