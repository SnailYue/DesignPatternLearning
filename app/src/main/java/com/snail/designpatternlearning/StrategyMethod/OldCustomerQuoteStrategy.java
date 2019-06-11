package com.snail.designpatternlearning.StrategyMethod;

import java.math.BigDecimal;

/**
 * @author created by Snail
 * date:2019/6/11
 * email:yuesnail@gmail.com
 */
public class OldCustomerQuoteStrategy implements IStrategy {
    @Override
    public BigDecimal getPrice(BigDecimal originalPrice) {
        return originalPrice = originalPrice.multiply(new BigDecimal(0.9)).setScale(2, BigDecimal.ROUND_UP);
    }
}
