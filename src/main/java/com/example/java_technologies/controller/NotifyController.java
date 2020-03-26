package com.example.java_technologies.controller;

import com.example.java_technologies.model.ChatMessage;
import com.example.java_technologies.model.MessageType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Controller;

@Controller
@EnableScheduling
public class NotifyController {

    @Autowired
    private SimpMessagingTemplate messagingTemplate;

    @Scheduled(fixedRate = 5000)
    public void greeting() throws InterruptedException {
        System.out.println("scheduled");
        ChatMessage payload = new ChatMessage();
        payload.setContent("Scheduler message");
        payload.setSender("Scheduler");
        payload.setType(MessageType.CHAT);
        this.messagingTemplate.convertAndSend("/topic/public", payload);
    }
}
