package com.dhl.spring.SpringBootDemo.services;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@Service
public class KafkaMessageService {

    private final List<String> messages = new CopyOnWriteArrayList<>();

    /*@KafkaListener(topics = "your-topic-name", groupId = "your-group-id")
    public void listen(String message) {
        messages.add(message);
    }*/

    public List<String> getMessages() {
        return messages;
    }
}