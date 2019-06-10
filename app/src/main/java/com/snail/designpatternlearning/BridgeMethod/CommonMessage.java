package com.snail.designpatternlearning.BridgeMethod;

/**
 * @author created by Snail
 * date:2019/6/10
 * email:yuesnail@gmail.com
 */
public class CommonMessage extends AbstractMessage{

    public CommonMessage(MessageImpl messageImpl) {
        super(messageImpl);
    }

    @Override
    public void sendMessage(Message message) {
        message.setLevel(2);
        super.sendMessage(message);
    }
}
