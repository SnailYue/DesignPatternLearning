package com.snail.designpatternlearning.StrategyMethod;

import java.math.BigDecimal;

/**
 * @author created by Snail
 * date:2019/6/11
 * email:yuesnail@gmail.com
 */
public class QuoteContext {
    private IStrategy iStrategy;

    public QuoteContext(IStrategy iStrategy) {
        this.iStrategy = iStrategy;
    }

    public BigDecimal getPrice(BigDecimal originalPrice) {
        return iStrategy.getPrice(originalPrice);
    }
}
