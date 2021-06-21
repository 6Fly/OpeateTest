package com.project.pratice.listener.impl;

import com.project.pratice.publisher.OrderEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @author L
 */
@Component
public class SmsListener implements ApplicationListener<OrderEvent> {
    @Override
    public void onApplicationEvent(OrderEvent orderEvent) {
        System.out.println("SmsListener 发送信息 "+ orderEvent.getMessage());
    }
}
