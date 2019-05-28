package com.snail.designpatternlearning.BuilderMethod;

/**
 * @author created by Snail
 * date:2019/5/28
 * email:yuesnail@gmail.com
 */
public class SurfaceComputerBuilder extends Builder {
    private Computer computer = new Computer();
    @Override
    void buildCPU() {
        computer.setCPU("Core i9");
    }

    @Override
    void buildGraphics() {
        computer.setGraphics("Nvidia 1080Ti");
    }

    @Override
    void buildMainBoard() {
        computer.setGraphics("MicroSoft");
    }

    @Override
    void buildDisplay() {
        computer.setDisPlay("LG");
    }

    @Override
    Computer buildComputer() {
        return computer;
    }
}
