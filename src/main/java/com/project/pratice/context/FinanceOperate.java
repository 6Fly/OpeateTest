package com.project.pratice.context;

import com.project.pratice.Utills.SpringUtils;
import com.project.pratice.base.result.Result;
import com.project.pratice.strategy.FinanceStrategy;
import org.springframework.stereotype.Component;

@Component
public class FinanceOperate {

    public Result loanOperate(){
        FinanceStrategy financeStrategy = SpringUtils.getBean("baoFooOperate",FinanceStrategy.class);
        return financeStrategy.loanOperate();
    }
}
