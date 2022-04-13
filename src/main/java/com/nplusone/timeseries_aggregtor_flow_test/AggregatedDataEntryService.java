package com.nplusone.timeseries_aggregtor_flow_test;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.atomic.LongAdder;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AggregatedDataEntryService {

    public void test() {
        LongAdder longAdder = new LongAdder();
        Dao dao = new Dao();
        List<AggregatedDataEntry> results = dao
                .getAsStreamsAsync(List.of("guid1", "guid2", "guid3"))
                .stream()
                .map(stream -> stream.peek(value -> longAdder.increment()))
                .flatMap(filter(100, 0))
                .collect(Collectors.toList());

        System.out.println(results);
    }

    private Function<Stream<AggregatedDataEntry>, Stream<AggregatedDataEntry>> filter(int limit, int offset) {
        return (stream) -> {
            Stream<AggregatedDataEntry> startStream = stream.skip(offset);

            return startStream.limit(limit);
        };
    }

    public static void main(String[] args) {
        AggregatedDataEntryService service = new AggregatedDataEntryService();
        service.test();


/*
        if (args.length == 0) {
            throw new Exception("asdasdasasd ");
        }

        if (args.length == 0) {
            //throw new Exception();
        }

        if (args.length == 0) {
            //throw new Exception();
        }
*/

    }
}












