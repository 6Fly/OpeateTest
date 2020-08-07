package com.cfam.factory;

import com.cfam.model.FinanceOperateModel;
import com.cfam.strategy.impl.WeChatPay;
import com.google.common.collect.Maps;
import org.checkerframework.checker.units.qual.C;
import org.springframework.stereotype.Component;

import java.util.Map;


/**
 * 工厂-策略-模板 demo
 */
public class FinanceOperateFactory {
    /**
     * 初始化注册Map
     */
    private static Map<String, FinanceOperateModel> strategyMap = Maps.newHashMap();

    /**
     * 注册策略实现
     * @param name
     * @param handler
     */
    public static void register(String name, FinanceOperateModel handler){
        if (name == null || handler == null){
            return;
        }
        strategyMap.put(name,handler);
    }
    /**
     * 获取注册实例
     * @param name
     */
    public static FinanceOperateModel getInvokeStrategy(String name){
        return strategyMap.get(name);
    }

}
