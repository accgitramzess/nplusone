package com.nplusone.broker.kafka.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class Event {

    private final long id;

    private final long type;

    private final String data;
}
