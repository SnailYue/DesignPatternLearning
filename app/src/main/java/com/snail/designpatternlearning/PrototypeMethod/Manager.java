package com.snail.designpatternlearning.PrototypeMethod;

import java.util.concurrent.ConcurrentHashMap;

/**
 * @author created by Snail
 * date:2019/6/5
 * email:yuesnail@gmail.com
 */
public class Manager {
    private ConcurrentHashMap<String, ElectronicsProduct> map = new ConcurrentHashMap<>();

    public void register(String name, ElectronicsProduct electronicsPruduct) {
        map.put(name, electronicsPruduct);
    }

    public ElectronicsProduct create(String name) {
        ElectronicsProduct ep = (ElectronicsProduct) map.get(name);
        return ep.createClone();
    }
}
