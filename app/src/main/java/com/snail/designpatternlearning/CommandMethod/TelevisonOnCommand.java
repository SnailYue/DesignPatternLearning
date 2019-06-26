package com.snail.designpatternlearning.CommandMethod;

/**
 * @author created by Snail
 * date:2019/6/26
 * email:yuesnail@gmail.com
 */
public class TelevisonOnCommand implements Command {

    Television television;

    public TelevisonOnCommand(Television _television) {
        this.television = _television;
    }

    @Override
    public void excute() {
        television.onTelevision();
    }

    @Override
    public void undo() {
        television.offTelevision();
    }
}
