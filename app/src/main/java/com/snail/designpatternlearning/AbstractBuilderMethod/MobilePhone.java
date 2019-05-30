package com.snail.designpatternlearning.AbstractBuilderMethod;

/**
 * @author created by Snail
 * date:2019/5/28
 * email:yuesnail@gmail.com
 */
public class MobilePhone {
    private String CPU;
    private String Graphics;
    private String MainBoard;
    private String DisPlay;

    public MobilePhone() {
        throw new RuntimeException("can't init");
    }

    public MobilePhone(Builder builder) {
        this.CPU = builder.CPU;
        this.Graphics = builder.Graphics;
        this.MainBoard = builder.MainBoard;
        this.DisPlay = builder.DisPlay;
    }

    public String getCPU() {
        return CPU;
    }

    public String getGraphics() {
        return Graphics;
    }

    public String getMainBoard() {
        return MainBoard;
    }

    public String getDisPlay() {
        return DisPlay;
    }

    public static class Builder {
        private String CPU;
        private String Graphics;
        private String MainBoard;
        private String DisPlay;

        public Builder() {

        }

        public Builder CPU(String val) {
            CPU = val;
            return this;
        }

        public Builder Graphics(String val) {
            Graphics = val;
            return this;
        }

        public Builder MainBoard(String val) {
            MainBoard = val;
            return this;
        }

        public Builder Display(String val) {
            DisPlay = val;
            return this;
        }

        public MobilePhone build() {
            return new MobilePhone(this);
        }
    }
}
