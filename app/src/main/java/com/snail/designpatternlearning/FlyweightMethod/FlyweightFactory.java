package com.snail.designpatternlearning.FlyweightMethod;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/**
 * @author created by Snail
 * date:2019/6/25
 * email:yuesnail@gmail.com
 */
public class FlyweightFactory {
    private static ConcurrentMap<String, Flyweight> pool = new ConcurrentHashMap<>();

    public static Flyweight getFlyweight(String extrinsic) {
        Flyweight flyweight = null;
        if (pool.containsKey(extrinsic)) {
            flyweight = pool.get(extrinsic);
        } else {
            flyweight = new CarFlyweight(extrinsic);
        }
        return flyweight;
    }
}
