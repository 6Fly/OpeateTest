package com.project.pratice.listener.impl;

import com.project.pratice.listener.EventListener;
import lombok.extern.java.Log;

/**
 * 操作监听日志
 * @author L
 */
@Log
public class OperateLogListener implements EventListener {
    private String type;

    public OperateLogListener(String message) {
        this.type = message;
    }

    @Override
    public void update(String eventType, String message) {
        log.info("listener type : {"+this.type+"} operate message:{"+message+"}operate type :"+ eventType);
    }
}
