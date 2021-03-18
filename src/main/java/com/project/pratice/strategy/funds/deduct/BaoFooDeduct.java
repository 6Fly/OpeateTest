package com.project.pratice.strategy.funds.deduct;


import com.project.pratice.factory.fundsOperate.DeductOperateFactory;
import com.project.pratice.strategy.funds.DeductOperate;
import org.springframework.stereotype.Component;

/**
 * @author L
 * 宝付扣款实现
 */
@Component
public class BaoFooDeduct extends DeductOperate {

    @Override
    public void afterPropertiesSet(){
        DeductOperateFactory.register("baoFoo",this);
    }

    @Override
    public String directDeduct(){
        return "宝付直扣";
    }


    @Override
    public String splitDeduct(){
        return "宝付分账";
    }
}
