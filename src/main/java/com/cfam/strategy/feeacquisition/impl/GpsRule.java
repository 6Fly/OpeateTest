package com.cfam.strategy.feeacquisition.impl;

import com.cfam.factory.ServiceFeeFactory;
import com.cfam.strategy.feeacquisition.RuleFeeItem;
import org.springframework.stereotype.Component;

/**
 * GPS 金额规则
 * @author L
 */
@Component
public class GpsRule implements RuleFeeItem {

    @Override
    public void afterPropertiesSet() {
        ServiceFeeFactory.register("gpsFee",this);
    }
    @Override
    public String getFeeInRule(String productId, String version, String amount) {
        //TODO 配合产品二期
        return null;
    }

}
