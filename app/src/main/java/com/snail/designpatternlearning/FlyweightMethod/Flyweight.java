package com.snail.designpatternlearning.FlyweightMethod;

/**
 * @author created by Snail
 * date:2019/6/25
 * email:yuesnail@gmail.com
 */
public abstract class Flyweight {
    private String intrinsic;

    protected final String extrinsic;

    public Flyweight(String _extrinsic){
        this.extrinsic = _extrinsic;
    }

    public abstract void operate();

    public String getIntrinsic() {
        return intrinsic;
    }

    public void setIntrinsic(String intrinsic) {
        this.intrinsic = intrinsic;
    }

}
