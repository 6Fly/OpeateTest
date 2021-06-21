package com.project.pratice.publisher;

import org.springframework.context.ApplicationEvent;

/**
 * @author L
 */
public class OrderEvent extends ApplicationEvent {

    private String message;

    public OrderEvent(Object source, String message) {
        super(source);
        this.message = message;
    }

    @Override
    public Object getSource(){
        return super.getSource();
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
