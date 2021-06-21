package com.project.pratice.controller;

import com.project.pratice.service.ListenerPracticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author L
 */
@RestController
public class SpringListenerController {

    @Autowired
    private ListenerPracticeService listenerPracticeService;
    @GetMapping("/practice")
    public void  practice(){
        listenerPracticeService.practice();
    }
}
