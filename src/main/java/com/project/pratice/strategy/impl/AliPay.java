package com.project.pratice.strategy.impl;

import com.project.pratice.factory.FinanceOperateFactory;
import com.project.pratice.model.FinanceOperateModel;
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
