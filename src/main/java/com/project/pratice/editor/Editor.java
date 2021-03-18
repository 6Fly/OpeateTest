package com.project.pratice.editor;

import com.project.pratice.publisher.EventManager;
import org.springframework.util.StringUtils;

/**
 * 具体发布者
 * @author L
 */
public class Editor {

    public EventManager events;

    private String message;


    public Editor() {
        this.events = new EventManager("send","save");
    }

    public void sendMessage(String message){
        this.message = message;
        events.notify("send",message);
    }

    public void saveMessage(){
        if (!StringUtils.isEmpty(this.message)){
            events.notify("save",this.message);
        }else {
            System.out.println("信息保存失败");
        }
    }
}
