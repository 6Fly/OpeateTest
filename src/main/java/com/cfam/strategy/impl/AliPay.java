package com.cfam.strategy.impl;

import com.cfam.factory.FinanceOperateFactory;
import com.cfam.model.FinanceOperateModel;
import org.springframework.stereotype.Component;

@Component
public class AliPay extends FinanceOperateModel {

    @Override
    public String loanOperate(String name){
       return name+"AliPay-----Loan";
    }

    @Override
    public String deductOperate(String name){
        return name+"AliPay-----Deduct";
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        FinanceOperateFactory.register("阿里",this);
    }
}
