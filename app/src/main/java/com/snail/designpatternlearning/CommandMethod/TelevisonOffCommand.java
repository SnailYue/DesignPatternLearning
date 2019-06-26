package com.snail.designpatternlearning.CommandMethod;

/**
 * @author created by Snail
 * date:2019/6/26
 * email:yuesnail@gmail.com
 */
public class TelevisonOffCommand implements Command {

    Television television;

    public TelevisonOffCommand(Television _televison) {
        this.television = _televison;
    }

    @Override
    public void excute() {
        television.offTelevision();
    }

    @Override
    public void undo() {
        television.onTelevision();
    }
}
