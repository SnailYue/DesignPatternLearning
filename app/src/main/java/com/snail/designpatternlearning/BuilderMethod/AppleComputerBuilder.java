package com.snail.designpatternlearning.BuilderMethod;

/**
 * @author created by Snail
 * date:2019/5/28
 * email:yuesnail@gmail.com
 */

/**
 * @author created by Snail
 * date:2019/5/28
 * email:yuesnail@gmail.com
 */
public class AppleComputerBuilder extends Builder {

    private Computer computer = new Computer();

    @Override
    void buildCPU() {
        computer.setCPU("Core i7");
    }

    @Override
    void buildGraphics() {
        computer.setGraphics("Nvidia 2080Ti");
    }

    @Override
    void buildMainBoard() {
        computer.setMainBoard("Apple");
    }

    @Override
    void buildDisplay() {
        computer.setDisPlay("Dell");
    }

    @Override
    Computer buildComputer() {
        return computer;
    }

}
