package com.project.pratice.strategy.impl;

import com.project.pratice.factory.FinanceOperateFactory;
import com.project.pratice.model.FinanceOperateModel;
import org.springframework.stereotype.Component;

@Component
public class WeChatPay extends FinanceOperateModel {

    @Override
    public String loanOperate(String name){
       return name+"WeChatPay------Loan";
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        FinanceOperateFactory.register("微信",this);
    }
}
