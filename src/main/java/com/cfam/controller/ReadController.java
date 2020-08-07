package com.cfam.controller;



import com.cfam.base.result.Result;
import com.cfam.factory.FinanceFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;



@RestController
public class ReadController {
    @Autowired
    private FinanceFactory financeFactory;

    @RequestMapping(value = "/read",method = RequestMethod.GET)
    public Result ReadOperation() {
        return financeFactory.getStrategy("weChatOperate").deductOperate();
    }
}
