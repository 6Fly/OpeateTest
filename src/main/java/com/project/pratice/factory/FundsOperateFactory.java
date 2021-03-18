package com.project.pratice.factory;


import com.project.pratice.bean.Customer;

/**
 * @author L
 * 财务资金操作
 */
public abstract class FundsOperateFactory {
    /**
     * 放款操作
     * @return LoanOperate
     */
    public String loanOperate(Customer customer){
        throw new UnsupportedOperationException();
    }

    /**
     * 扣款操作
     * @return DeductOperate
     */
    public String deductOperate(Customer customer){
        throw new UnsupportedOperationException();
    }

}
