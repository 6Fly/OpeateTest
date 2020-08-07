package com.cfam.strategy.impl;

import com.cfam.factory.FinanceOperateFactory;
import com.cfam.model.FinanceOperateModel;
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
