package com.cfam.factory;


import com.cfam.base.exception.BusinessException;
import com.cfam.bean.CostAllocation;

import com.cfam.strategy.feeacquisition.RuleFeeItem;
import com.google.common.collect.Maps;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.Map;

/**
 * 获取配置金额
 * @author L
 */
@Component
public class ServiceFeeFactory {
    /**
     * 百分比计算
     */
    private static final String PERCENTAGE = "1";
    /**
     * 固定值
     */
    private static final String FIXED_VALUE = "2";
    /**
     * 规则下固定值
     */
    private static final String VALUE_IN_RULE = "3";



    /**
     * 初始化注册Map
     */
    private static final Map<String, RuleFeeItem> RULE_FEE_ITEM_MAP = Maps.newHashMap();
    /**
     * 注册策略实现
     * @param name 对挺数据库key值
     * @param handler 实现
     */
    public static void register(String name, RuleFeeItem handler){
        if (name == null || handler == null){
            return;
        }
        RULE_FEE_ITEM_MAP.put(name,handler);
    }

    /**
     * 获取值
     * @param costAllocation 配置实体
     * @param productId 产品ID
     * @param version 版本
     * @param amount 金额
     * @return 金额
     */
    public String getServiceFee(CostAllocation costAllocation, String productId, String version, String amount){
        switch (costAllocation.getFixedCosts()){
            case PERCENTAGE:
                BigDecimal baseAmount = new BigDecimal(amount);
                BigDecimal ratio = new BigDecimal(costAllocation.getCostRatio()).divide(new BigDecimal("100"),10,BigDecimal.ROUND_HALF_UP);
                BigDecimal fee = baseAmount.multiply(ratio).setScale(2,BigDecimal.ROUND_HALF_UP);
                return fee.toString();
            case FIXED_VALUE:
                return costAllocation.getCostRatio();
            case VALUE_IN_RULE:
                return RULE_FEE_ITEM_MAP.get(costAllocation.getKey()).getFeeInRule(productId,version,amount);
            default:
                throw new BusinessException(2006,"无效的基准选项");
        }
    }


}
