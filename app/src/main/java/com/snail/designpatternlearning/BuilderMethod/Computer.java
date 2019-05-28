package com.snail.designpatternlearning.BuilderMethod;

/**
 * @author created by Snail
 * date:2019/5/28
 * email:yuesnail@gmail.com
 */
public class Computer {
    private String CPU;
    private String Graphics;
    private String MainBoard;
    private String DisPlay;

    public String getDisPlay() {
        return DisPlay;
    }

    public void setDisPlay(String disPlay) {
        DisPlay = disPlay;
    }

    public String getCPU() {
        return CPU;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public String getGraphics() {
        return Graphics;
    }

    public void setGraphics(String graphics) {
        Graphics = graphics;
    }

    public String getMainBoard() {
        return MainBoard;
    }

    public void setMainBoard(String mainBoard) {
        MainBoard = mainBoard;
    }
}
