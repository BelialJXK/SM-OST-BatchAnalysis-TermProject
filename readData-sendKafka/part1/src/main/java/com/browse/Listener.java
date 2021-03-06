package com.browse;

import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class Listener {

    @KafkaListener(topics = "topic1")
    public void onMessage(String message){
        System.out.println(message);
    }

}