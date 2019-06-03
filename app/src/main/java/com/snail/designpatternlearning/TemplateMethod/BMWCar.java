package com.snail.designpatternlearning.TemplateMethod;

import android.util.Log;

/**
 * @author created by Snail
 * date:2019/6/3
 * email:yuesnail@gmail.com
 */
public class BMWCar extends CarTemplate{
    private static final String TAG = "BMWCar";
    private SedanCar bmw = new SedanCar();

    @Override
    public void makeEngine() {
        bmw.setEngine("V8");
    }

    @Override
    public void makeBody() {
        bmw.setBody("Model T");
    }

    @Override
    public void makeWheel() {
        bmw.setWheel("Dunlop");
    }

    @Override
    public void showCarInfo() {
        Log.d(TAG, "showCarInfo: engine is " + bmw.getEngine() + ", body is " + bmw.getBody() + ", wheel is " + bmw.getWheel());
    }
}
