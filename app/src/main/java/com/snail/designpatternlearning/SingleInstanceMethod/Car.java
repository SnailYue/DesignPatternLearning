package com.snail.designpatternlearning.SingleInstanceMethod;

/**
 * @author created by Snail
 * date:2019/5/30
 * email:yuesnail@gmail.com
 */
public class Car {
    private static Car instance;
    private String carBrand;
    private float carPrice;
    private String carType;

    public synchronized static Car getInstance() {
        if (null == instance) {
            instance = new Car();
        }
        return instance;
    }

    public Car() {

    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public float getCarPrice() {
        return carPrice;
    }

    public void setCarPrice(float carPrice) {
        this.carPrice = carPrice;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }
}
