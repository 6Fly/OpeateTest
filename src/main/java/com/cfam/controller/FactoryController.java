package com.cfam.controller;

import com.cfam.factory.FinanceOperateFactory;
import com.cfam.model.FinanceOperateModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class FactoryController {

    @GetMapping(value = "factoryRun")
    public String factoryRun(){
        FinanceOperateModel strategy = FinanceOperateFactory.getInvokeStrategy("阿里");
        return strategy.deductOperate("AAA");

    }
}
