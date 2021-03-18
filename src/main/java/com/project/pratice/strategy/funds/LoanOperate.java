package com.project.pratice.strategy.funds;

import org.springframework.beans.factory.InitializingBean;

/**
 * @author L
 * 放款操作模板
 */
public abstract class LoanOperate implements InitializingBean {
    /**
     * 直接放款
     * @return Result
     */
    public String directLoan(){
        throw new UnsupportedOperationException("该三方不支持放款操作");
    }
}
