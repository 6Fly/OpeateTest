package com.project.pratice.factory;

import com.project.pratice.strategy.FinanceStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 工厂-策略 demo
 */
@Service
public class FinanceFactory {
    @Autowired
    Map<String, FinanceStrategy> strategies = new ConcurrentHashMap<>();
    public FinanceStrategy getStrategy(String component){
        FinanceStrategy financeStrategy = strategies.get(component);
        if(financeStrategy == null){

        }
        return financeStrategy;
    }
}
