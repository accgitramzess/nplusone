package com.nplusone.broker.kafka.dto;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Event {

    private final long id;

    private final long type;

    private final String data;
}
