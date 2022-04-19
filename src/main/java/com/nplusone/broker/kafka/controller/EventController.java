package com.nplusone.broker.kafka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nplusone.broker.kafka.dto.Event;
import com.nplusone.broker.kafka.service.EventProducerService;

@RestController
@RequestMapping("/event")
public class EventController {

    private final EventProducerService eventProducerService;

    @Autowired
    public EventController(EventProducerService eventProducerService) {
        this.eventProducerService = eventProducerService;
    }

    @PostMapping
    public void newEvent(@RequestBody Event event) {
        eventProducerService.send(event);
    }
}
