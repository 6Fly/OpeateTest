package com.project.pratice.publisher;

import com.project.pratice.listener.EventListener;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 基础发布者
 * @author L
 */
public class EventManager {

    Map<String, List<EventListener>> listeners = new HashMap();


    public EventManager(String... operations) {
        for (String operation : operations) {
            this.listeners.put(operation, new ArrayList<>());
        }
    }

    /**
     * 订阅监听
     */
    public void subscribe(String evenType,EventListener listener){
        List<EventListener> user = listeners.get(evenType);
        user.add(listener);
    }

    /**
     * 移除订阅
     * @param evenType 类型
     * @param listener 监听者
     */
    public void removeSubscribe(String evenType,EventListener listener){
        List<EventListener> users = listeners.get(evenType);
        users.remove(listener);
    }

    /**
     * 通知监听者
     * @param evenType
     * @param message
     */
    public void notify(String evenType,String message){
        List<EventListener> users = listeners.get(evenType);
        for (EventListener user:users){
            user.update(evenType,message);
        }
    }
}
