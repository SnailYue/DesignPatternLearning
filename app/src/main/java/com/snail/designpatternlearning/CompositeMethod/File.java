package com.snail.designpatternlearning.CompositeMethod;

import android.util.Log;

/**
 * @author created by Snail
 * date:2019/6/12
 * email:yuesnail@gmail.com
 */
public class File extends Entry {
    private static final String TAG = "File";
    private String name;
    private int size;

    public File(String name,int size) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void printList(String prefix) {
        System.out.println(prefix + '/' + this);
    }
}
