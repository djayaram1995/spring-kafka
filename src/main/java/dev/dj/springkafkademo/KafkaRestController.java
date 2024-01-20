package dev.dj.springkafkademo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafkaRestController {

    @Autowired
    private KafkaProducer kafkaProducer;
    @GetMapping("send-message")
    public ResponseEntity<String> responseEntity(@RequestParam(name = "msg") String msg) {
        kafkaProducer.sendMessage(msg);
        return ResponseEntity.ok("sent");
    }
}
