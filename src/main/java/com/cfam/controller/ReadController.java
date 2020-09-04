package com.cfam.controller;



import com.cfam.base.result.Result;
import com.cfam.factory.FinanceFactory;
import com.cfam.service.Shop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.Future;


@RestController
public class ReadController {
    @Autowired
    private FinanceFactory financeFactory;

    @Autowired
    private Shop shop;

    @RequestMapping(value = "/read",method = RequestMethod.GET)
    public Result ReadOperation() {
        return financeFactory.getStrategy("weChatOperate").deductOperate();
    }

    @RequestMapping(value = "/async",method = RequestMethod.GET)
    public String async() {

        long la = System.currentTimeMillis();
        shop.getPrice();
        System.out.println(System.currentTimeMillis()-la);

        long lb = System.currentTimeMillis();
        Future<Double> asyncPrice = shop.getAsyncPrice();
        System.out.println(System.currentTimeMillis()-lb);

        long lc = System.currentTimeMillis();
        shop.getAnnotationPrice();
        System.out.println(System.currentTimeMillis()-lc);

        return "1";
    }


}
