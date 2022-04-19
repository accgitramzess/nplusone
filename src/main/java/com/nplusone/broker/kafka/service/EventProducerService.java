package com.nplusone.broker.kafka.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.nplusone.broker.kafka.dto.Event;

@Service
public class EventProducerService {

    private final KafkaTemplate<Long, Event> kafkaEventTemplate;

    @Autowired
    public EventProducerService(KafkaTemplate<Long, Event> kafkaEventTemplate) {
        this.kafkaEventTemplate = kafkaEventTemplate;
    }

    public void send(Event event) {
        kafkaEventTemplate.send("event", event);
    }
}
