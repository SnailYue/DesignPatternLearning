package com.snail.designpatternlearning.AdapterMethod;

/**
 * @author created by Snail
 * date:2019/6/2
 * email:yuesnail@gmail.com
 */
public class Adapter<T> implements IAdapter<T>{
    private TypeC typeC = new TypeC();

    @Override
    public T transform(T data) {
        String newData = ((Usb)data).getData();
        typeC.setData(newData.replace("usb","Type C"));
        return (T) typeC;
    }
}
