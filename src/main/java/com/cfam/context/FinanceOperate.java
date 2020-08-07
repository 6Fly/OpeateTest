package com.cfam.context;

import com.cfam.Utills.SpringUtils;
import com.cfam.base.result.Result;
import com.cfam.strategy.FinanceStrategy;
import org.springframework.stereotype.Component;

@Component
public class FinanceOperate {

    public Result loanOperate(){
        FinanceStrategy financeStrategy = SpringUtils.getBean("baoFooOperate",FinanceStrategy.class);
        return financeStrategy.loanOperate();
    }
}
