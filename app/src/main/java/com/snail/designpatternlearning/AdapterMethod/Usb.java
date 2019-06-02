package com.snail.designpatternlearning.AdapterMethod;

/**
 * @author created by Snail
 * date:2019/6/2
 * email:yuesnail@gmail.com
 */
public class Usb {
    private String data;

    public Usb(String data){
        this.data = data;
    }
    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
