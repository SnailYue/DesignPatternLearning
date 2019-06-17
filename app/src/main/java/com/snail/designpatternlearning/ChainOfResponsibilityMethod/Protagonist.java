package com.snail.designpatternlearning.ChainOfResponsibilityMethod;

/**
 * @author created by Snail
 * date:2019/6/17
 * email:yuesnail@gmail.com
 */
public class Protagonist {
    private int forceValue;
    private String name;
    private int age;

    public Protagonist(String name,int age,int forceValue){
        this.name = name;
        this.age = age;
        this.forceValue = forceValue;
    }

    public int getForceValue() {
        return forceValue;
    }

    public void setForceValue(int forceValue) {
        this.forceValue = forceValue;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
