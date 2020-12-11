package com.cfam.strategy.funds.deduct;


import com.cfam.factory.fundsOperate.DeductOperateFactory;
import com.cfam.strategy.funds.DeductOperate;
import org.springframework.stereotype.Component;

/**
 * @author L
 * 通联扣款实现
 */
@Component
public class AllinPayDeduct extends DeductOperate {


    @Override
    public void afterPropertiesSet(){
        DeductOperateFactory.register("allinPay",this);
    }

    @Override

    public String directDeduct(){
        return "通联直扣";
    }

}
