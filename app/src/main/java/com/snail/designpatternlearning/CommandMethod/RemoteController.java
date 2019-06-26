package com.snail.designpatternlearning.CommandMethod;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/**
 * @author created by Snail
 * date:2019/6/26
 * email:yuesnail@gmail.com
 */
public class RemoteController {
    private Command unCommand;
    private ConcurrentMap<String,Command> onCommand = new ConcurrentHashMap<>();
    private ConcurrentMap<String,Command> offCommand = new ConcurrentHashMap<>();

    public RemoteController(){
        NullCommand nullCommand = new NullCommand();
        onCommand.put("nullCommand",nullCommand);
    }

    public void setCommand(String key,Command onCommand,Command offCommand){
        this.onCommand.put(key, onCommand);
        this.offCommand.put(key, offCommand);
    }

    public void onButtonPushed(String key){
        this.onCommand.get(key).excute();
        unCommand = offCommand.get(key);
    }

    public void offButtonPushed(String key){
        this.offCommand.get(key).excute();
        unCommand = onCommand.get(key);
    }

    public void unDoButtonPushed(){
        unCommand.undo();
    }
}
