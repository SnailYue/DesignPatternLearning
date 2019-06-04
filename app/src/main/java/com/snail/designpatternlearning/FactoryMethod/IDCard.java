package com.snail.designpatternlearning.FactoryMethod;

import android.util.Log;

/**
 * @author created by Snail
 * date:2019/6/4
 * email:yuesnail@gmail.com
 */
public class IDCard extends Product{
    private static final String TAG = "IDCard";
    private String owner;

    public IDCard(String owner){
        this.owner = owner;
    }

    public String getOwner() {
        return owner;
    }

    @Override
    public void use() {
        Log.d(TAG, "use: " + owner + "is use card");
    }
}
