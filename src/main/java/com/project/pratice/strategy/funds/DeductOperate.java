package com.project.pratice.strategy.funds;

import org.springframework.beans.factory.InitializingBean;

/**
 * @author L
 * 扣款操作模板
 */
public abstract class DeductOperate implements InitializingBean {
    /**
     * 直接扣款操作
     * @return Result
     */
    public String directDeduct(){
        throw new UnsupportedOperationException("该三方不支持直接扣款操作");
    }

    /**
     * 分账扣款操作
     * @return Result
     */
    public String splitDeduct(){
        throw new UnsupportedOperationException(this+"(不支持分账扣款操作)");
    }
}
