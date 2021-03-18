package com.project.pratice.factory.fundsOperate;

import com.project.pratice.bean.Customer;
import com.project.pratice.enums.TripartiteEnum;
import com.project.pratice.factory.FundsOperateFactory;
import com.project.pratice.strategy.funds.DeductOperate;
import com.google.common.collect.Maps;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @author L
 * 扣款注册
 */
@Component
public class DeductOperateFactory extends FundsOperateFactory {
    /**
     * 初始化注册Map
     */
    private static final Map<String, DeductOperate> STRATEGY_MAP = Maps.newHashMap();

    /**
     * 注入放款三方
     * @param handleName
     * @param handle
     */
    public static void register(String handleName, DeductOperate handle){
        if (handleName == null || handle == null){

            return;
        }
        STRATEGY_MAP.put(handleName,handle);
    }

    /**
     * 扣款操作
     * @return DeductOperate
     */
    @Override
    public String deductOperate(Customer customer){
        Integer tripartiteType = customer.getTripartiteType();

        //获取执行三方
        DeductOperate deductOperate = STRATEGY_MAP.get(TripartiteEnum.getTripartiteEnum(tripartiteType));
        //该产品是否直接扣款
        if (customer.isdType()){
          return deductOperate.directDeduct();
        }
        return deductOperate.splitDeduct();
    }

}
