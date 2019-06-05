package com.snail.designpatternlearning.PrototypeMethod;

import android.util.Log;

/**
 * @author created by Snail
 * date:2019/6/5
 * email:yuesnail@gmail.com
 */
public class IPadLine extends ElectronicsProduct {
    private static final String TAG = "IPadLine";

    @Override
    public void makeProduct(String s) {
        Log.d(TAG, "makeProduct: " + s);
    }

    @Override
    public ElectronicsProduct createClone() {
        ElectronicsProduct ep = null;
        try {
            ep = (ElectronicsProduct) clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return ep;
    }
}
