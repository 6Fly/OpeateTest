package com.project.pratice.controller;

import com.project.pratice.factory.FinanceOperateFactory;
import com.project.pratice.model.FinanceOperateModel;
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
