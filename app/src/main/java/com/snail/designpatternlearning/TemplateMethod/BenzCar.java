package com.snail.designpatternlearning.TemplateMethod;

import android.util.Log;

/**
 * @author created by Snail
 * date:2019/6/3
 * email:yuesnail@gmail.com
 */
public class BenzCar extends CarTemplate{

    private static final String TAG = "BenzCar";
    private SedanCar benz = new SedanCar();

    @Override
    public void makeEngine() {
        benz.setEngine("V6");
    }

    @Override
    public void makeBody() {
        benz.setBody("Model A");
    }

    @Override
    public void makeWheel() {
        benz.setWheel("Michelin");
    }

    @Override
    public void showCarInfo() {
        Log.d(TAG, "showCarInfo: engine is " + benz.getEngine() + ", body is " + benz.getBody() + ", wheel is " + benz.getWheel());
    }
}
