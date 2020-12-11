package com.cfam.factory;

import com.cfam.bean.Customer;
import com.cfam.strategy.FinanceStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;


@Component
public class FlowFactory {

    @Autowired
    Map<String, FundsOperateFactory> strategies = new ConcurrentHashMap<>();

    public String getStrategy(int node, Customer customer){
       if (node ==1){
           return strategies.get("loanOperateFactory").loanOperate(customer);
       }else {
           return strategies.get("deductOperateFactory").deductOperate(customer);
       }
    }
}
