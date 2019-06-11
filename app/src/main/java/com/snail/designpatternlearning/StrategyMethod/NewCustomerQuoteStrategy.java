package com.snail.designpatternlearning.StrategyMethod;

import java.math.BigDecimal;

/**
 * @author created by Snail
 * date:2019/6/11
 * email:yuesnail@gmail.com
 */
public class NewCustomerQuoteStrategy implements IStrategy {
    @Override
    public BigDecimal getPrice(BigDecimal originalPrice) {
        return originalPrice;
    }
}
