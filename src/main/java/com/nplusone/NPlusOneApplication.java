package com.nplusone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;
import java.util.Map;
import java.util.stream.Stream;


/**
 *
 *
 *
 *
 *
 *
 */

@SpringBootApplication
public class NPlusOneApplication {

    /*final class Test {
        private final Date date;
        private final Map<String, String> map;

        public Test(Date date, Map<String, String> map) {
            this.date = (Date) date.clone();
            this.map = map.;
        }

        public Date getDate() {
            return date.clone();
        }

        public Map<String, String> getMap() {
            return map;
        }
    }*/

    public static void main(String[] args) {
        SpringApplication.run(NPlusOneApplication.class, args);
        /*Integer sum = Stream
                .of(1, 2, 3, 4, 5, 6)
                .reduce(0, (A, B) -> A + B);*/

        /*select *
                from emp
                left join order on emp.id = order.id
                group by order.id
                having count(order.id) > 10*/
    }
}
