package com.cfam.model;

import org.springframework.beans.factory.InitializingBean;

/**
 * 模板
 */
public abstract class FinanceOperateModel implements InitializingBean {
    public String loanOperate(String name){
        throw new UnsupportedOperationException();
    }
    public String deductOperate(String name){
        throw new UnsupportedOperationException();
    }
}
