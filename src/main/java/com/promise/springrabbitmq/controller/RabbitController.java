package com.promise.springrabbitmq.controller;

import com.promise.springrabbitmq.publisher.RabbitMqProducer;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequiredArgsConstructor
@RequestMapping("/api")
public class RabbitController {
    private final RabbitMqProducer producer;

    @GetMapping("/publish")
    public String publishMessage(@RequestParam("message") String message) {
        producer.sendMessage(message);
        return "the message has bent successfully";
    }

    @GetMapping
    public String greetings() {
        return "welcome to the page";
    }
}
