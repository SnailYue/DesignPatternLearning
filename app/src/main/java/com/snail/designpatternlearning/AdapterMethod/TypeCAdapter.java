package com.snail.designpatternlearning.AdapterMethod;

/**
 * @author created by Snail
 * date:2019/6/2
 * email:yuesnail@gmail.com
 */
public class TypeCAdapter extends Adapter implements ITarget {
    private Usb usb;

    public TypeCAdapter(Usb data) {
        this.usb = data;
    }

    @Override
    public Object getTransformObject() {
        return transform(usb);
    }
}
