package com.project.pratice.listener;

/**
 * 通用观察者接口
 * @author L
 */
public interface EventListener {
    /**
     * 更新
     * @param eventType
     * @param message
     */
    void update(String eventType, String message);
}
