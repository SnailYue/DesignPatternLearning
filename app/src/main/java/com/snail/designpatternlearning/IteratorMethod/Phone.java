package com.snail.designpatternlearning.IteratorMethod;

/**
 * @author created by Snail
 * date:2019/6/1
 * email:yuesnail@gmail.com
 */
public class Phone {
    private String brand;
    private String level;
    private int price;

    public Phone(String brand, String level, int price) {
        this.brand = brand;
        this.level = level;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
