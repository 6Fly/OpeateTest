package com.cfam.strategy.funds.loan;


import com.cfam.factory.fundsOperate.LoanOperateFactory;
import com.cfam.strategy.funds.LoanOperate;
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
