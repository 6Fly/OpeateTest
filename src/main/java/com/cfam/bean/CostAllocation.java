package com.cfam.bean;


import lombok.Getter;
import lombok.Setter;

/**
 * 费用项配置
 * @author L
 */
@Getter
@Setter
public class CostAllocation {
    /**
     * 费用项标识
     */
    private String key;
    /**
     *  费率
     */
    private String costRatio;
    /**
     * 固定费用项
     */
    private String fixedCosts;
    /**
     * 计算基准
     */
    private String calculationBasisId;
    /**
     * 是否加融
     */
    private String additionalFinancingSideId;
}
