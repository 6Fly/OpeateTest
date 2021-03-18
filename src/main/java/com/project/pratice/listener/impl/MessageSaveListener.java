package com.project.pratice.listener.impl;

import com.project.pratice.listener.EventListener;
import lombok.extern.java.Log;

/**
 * @author L
 */
@Log
public class MessageSaveListener implements EventListener {

    private final String type;

    public MessageSaveListener(String message) {
        this.type = message;
    }

    @Override
    public void update(String eventType, String message) {
        log.info("listener type : {"+this.type+"} operate message:{"+message+"}operate type :"+ eventType);
    }
}
