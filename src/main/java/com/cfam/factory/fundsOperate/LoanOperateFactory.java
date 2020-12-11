package com.cfam.factory.fundsOperate;


import com.cfam.bean.Customer;
import com.cfam.enums.TripartiteEnum;
import com.cfam.factory.FundsOperateFactory;
import com.cfam.strategy.funds.LoanOperate;
import com.google.common.collect.Maps;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @author L
 * 放款操作注册
 */
@Component
public class LoanOperateFactory extends FundsOperateFactory {
    /**
     * 初始化注册Map
     */
    private static final Map<String, LoanOperate> STRATEGY_MAP = Maps.newHashMap();

    /**
     * 注入放款
     * @param handleName
     * @param handle
     */
    public static void register(String handleName, LoanOperate handle){
        if (handleName == null || handle == null){
            return;
        }
        STRATEGY_MAP.put(handleName,handle);
    }

    /**
     * 放款操作
     * @return LoanOperate
     */
    @Override
    public String loanOperate(Customer customer){
        Integer tripartiteType = customer.getTripartiteType();
        //获取执行三方
        LoanOperate loanOperate = STRATEGY_MAP.get(TripartiteEnum.getTripartiteEnum(tripartiteType));
        return loanOperate.directLoan();
    }


}
