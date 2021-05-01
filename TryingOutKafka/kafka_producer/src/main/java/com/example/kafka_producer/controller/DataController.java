package com.example.kafka_producer.controller;

import org.apache.kafka.common.protocol.types.Field;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("kafka")
public class DataController {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    private static final String topic = "Kafka_Example";

    @GetMapping("/publish/{message}")
    public String postMessage(@PathVariable("message") String message) {

        System.out.println("Came to Post Message with Message: " + message);

        kafkaTemplate.send(topic, message);
        return "Published Successfully message: " + message;
    }

}
