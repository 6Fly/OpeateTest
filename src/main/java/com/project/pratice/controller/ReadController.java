package com.project.pratice.controller;



import com.project.pratice.base.result.Result;
import com.project.pratice.factory.FinanceFactory;
import com.project.pratice.service.CalculationService;
import com.project.pratice.service.Shop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
import java.util.concurrent.Future;


@RestController
public class ReadController {
    @Autowired
    private FinanceFactory financeFactory;

    @Autowired
    private Shop shop;
    @Autowired
    private CalculationService calculationService;

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
    @RequestMapping(value = "/cal",method = RequestMethod.GET)
    public void cal(){
        Map<String, Double> stringDoubleMap = calculationService.calAmount("23", "1", "10000");
        System.out.println(stringDoubleMap);
    }


}
