package com.snail.designpatternlearning.ChainOfResponsibilityMethod;

import android.util.Log;

/**
 * @author created by Snail
 * date:2019/6/17
 * email:yuesnail@gmail.com
 */
public class TogetherFightHandler extends FightHandler {
    private static final String TAG = "SelfFightHandler";

    @Override
    public void fightWith(Protagonist protagonist) {
        if (protagonist.getForceValue() > 300) {
            Log.d(TAG, "fightWith: 门派全部上阵");
        } else {
            successor.fightWith(protagonist);
        }
    }
}
