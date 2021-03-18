package com.project.pratice.factory;

import com.project.pratice.bean.Customer;
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
