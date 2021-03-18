package com.project.pratice.strategy.funds.loan;


import com.project.pratice.factory.fundsOperate.LoanOperateFactory;
import com.project.pratice.strategy.funds.LoanOperate;
import org.springframework.stereotype.Component;

/**
 * @author L
 * 宝付放款款实现
 */
@Component
public class BaoFooLoan extends LoanOperate {

    @Override
    public void afterPropertiesSet(){
        LoanOperateFactory.register("baoFoo",this);
    }

    @Override
    public String directLoan(){
        return "宝付放款";
    }
}
