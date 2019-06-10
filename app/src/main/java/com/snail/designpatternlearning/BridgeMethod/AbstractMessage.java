package com.snail.designpatternlearning.BridgeMethod;

/**
 * @author created by Snail
 * date:2019/6/10
 * email:yuesnail@gmail.com
 */
public abstract class AbstractMessage {
    MessageImpl messageImpl;

    public AbstractMessage(MessageImpl messageImpl) {
        this.messageImpl = messageImpl;
    }

    public void sendMessage(Message message) {
        this.messageImpl.send(message);
    }
}
