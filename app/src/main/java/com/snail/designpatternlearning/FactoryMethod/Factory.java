package com.snail.designpatternlearning.FactoryMethod;

/**
 * @author created by Snail
 * date:2019/6/4
 * email:yuesnail@gmail.com
 */
public abstract class Factory {
    public final Product create(String owner){
        Product p = createProduct(owner);
        registerProduct(p);
        return p;
    }

    abstract Product createProduct(String owner);
    abstract void registerProduct(Product product);
}
