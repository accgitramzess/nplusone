package com.nplusone.broker.kafka.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.nplusone.broker.kafka.dto.Event;

@Service
public class EventConsumerService {

    @KafkaListener(
            topics = "event",
            groupId = "event_group",
            containerFactory = "eventKafkaListenerContainerFactory"
    )
    private void listen(Event event) {

    }
}
