package com.nplusone.timeseries_aggregtor_flow_test;

import lombok.Data;

import java.util.Spliterators;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Data
public class AggregatedDataEntry {

    private int id;

    private String classificationId;

    public AggregatedDataEntry(int id, String classificationId) {
        this.id = id;
        this.classificationId = classificationId;
        Stream.of(1, 3, 4).parallel().collect(Collectors.toList());
        //Spliterators.spliteratorUnknownSize();
    }
}
