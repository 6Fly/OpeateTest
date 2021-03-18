package com.project.pratice.service;

import com.project.pratice.bean.Customer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FundsTest {
    @Autowired
    private FundsOperateService operateService;
    @Test
    public void fundsTest(){
        String s = operateService.financeOperate(2, new Customer("T0T",true,3));
        System.out.println(s);
    }

}
