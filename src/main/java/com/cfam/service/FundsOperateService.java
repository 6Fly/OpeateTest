package com.cfam.service;

import com.cfam.bean.Customer;
import com.cfam.factory.FlowFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FundsOperateService {

    @Autowired
    private FlowFactory flowFactory;

    public String financeOperate(int node,Customer customer){
        return flowFactory.getStrategy(node,customer);
    }
}
