package com.snail.designpatternlearning.ChainOfResponsibilityMethod;

import android.util.Log;

/**
 * @author created by Snail
 * date:2019/6/17
 * email:yuesnail@gmail.com
 */
public class SelfFightHandler extends FightHandler {
    private static final String TAG = "SelfFightHandler";

    @Override
    public void fightWith(Protagonist protagonist) {
        if (protagonist.getForceValue() < 100) {
            Log.d(TAG, "自己上阵");
        } else {
            successor.fightWith(protagonist);
        }
    }
}
