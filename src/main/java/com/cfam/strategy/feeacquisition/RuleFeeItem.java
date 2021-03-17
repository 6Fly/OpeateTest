package com.cfam.strategy.feeacquisition;

import org.springframework.beans.factory.InitializingBean;

/**
 * 规则费用项
 * @author L
 */
public interface RuleFeeItem extends InitializingBean {
    /**
     * 获取规则下的固定金额
     * @param productId 产品ID
     * @param version  版本
     * @param amount 金额
     * @return 金额
     */
    public String getFeeInRule(String productId,String version,String amount);
}
