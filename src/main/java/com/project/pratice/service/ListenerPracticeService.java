package com.project.pratice.service;


import com.project.pratice.publisher.OrderEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

/**
 * @author L
 */
@Service
public class ListenerPracticeService {

    @Autowired
    private ApplicationContext applicationContext;

    public void  practice(){
        OrderEvent ev = new OrderEvent(this, "LOAN SUCCESS");
        applicationContext.publishEvent(ev);
    }



}
