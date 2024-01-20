package dev.dj.springkafkademo;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumer {

    @KafkaListener(topics = "${spring.kafka.topic}", groupId = "${spring.kafka.group-id}")
    public void listenGroupFoo(String message) {
        System.out.println("Received Message in group : " + message);
    }
}
