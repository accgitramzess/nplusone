package com.nplusone.timeseries_aggregtor_flow_test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Dao {

    // How to made multiple request to the database ??????????????

    // 1. parallel stream - is it good approach not sure

    // 2. completable future - looks like better solution

    public List<Stream<AggregatedDataEntry>> getAsStreams(Collection<String> classificationIds) {
        return classificationIds
                .parallelStream() // parallel execution for query
                .map(this::executeSqlQueries)
                .collect(Collectors.toList());
    }

    public List<Stream<AggregatedDataEntry>> getAsStreamsAsync(Collection<String> classificationIds) {
        List<CompletableFuture<Stream<AggregatedDataEntry>>> collect = classificationIds
                .stream()
                .map(classificationId -> CompletableFuture.supplyAsync(() -> executeSqlQueries(classificationId)))
                .collect(Collectors.toList());

        System.out.println(Thread.currentThread().getName() + " start join");

        List<Stream<AggregatedDataEntry>> result = collect
                .stream()
                .map(CompletableFuture::join)
                .collect(Collectors.toList());

        System.out.println(Thread.currentThread().getName() + " end join");

        return result;
    }

    private Stream<AggregatedDataEntry> executeSqlQueries(String classificationId) {
        System.out.println("ExecuteSqlQueries -> " + Thread.currentThread().getName());
        List<AggregatedDataEntry> data = new ArrayList<>();
        for (int i = 1; i <= 1000; i++) {
            data.add(new AggregatedDataEntry(i, classificationId));
        }

        return data.stream();
    }


}
