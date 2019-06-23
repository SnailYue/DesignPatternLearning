package com.snail.designpatternlearning.MementoMethod;

/**
 * @author created by Snail
 * date:2019/6/23
 * email:yuesnail@gmail.com
 */
public class Memento {
    private String stats;

    public Memento(String _state){
        this.stats = _state;
    }

    public String getStats() {
        return stats;
    }

    public void setStats(String stats) {
        this.stats = stats;
    }
}
