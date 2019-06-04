package com.snail.designpatternlearning.FactoryMethod;


import java.util.ArrayList;
import java.util.List;

/**
 * @author created by Snail
 * date:2019/6/4
 * email:yuesnail@gmail.com
 */
public class IDCardFactory extends Factory{
    private List<Product> list = new ArrayList<>();
    @Override
    Product createProduct(String owner) {
        return new IDCard(owner);
    }

    @Override
    void registerProduct(Product product) {
        list.add(product);
    }
}
