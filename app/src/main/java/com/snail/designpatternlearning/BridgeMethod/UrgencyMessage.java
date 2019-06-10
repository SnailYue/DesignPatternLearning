package com.snail.designpatternlearning.BridgeMethod;

/**
 * @author created by Snail
 * date:2019/6/10
 * email:yuesnail@gmail.com
 */
public class UrgencyMessage extends AbstractMessage{

    public UrgencyMessage(MessageImpl messageImpl) {
        super(messageImpl);
    }

    @Override
    public void sendMessage(Message message) {
        message.setLevel(0);
        super.sendMessage(message);
    }

    public Object watch(Message message){
        return null;
    }
}
