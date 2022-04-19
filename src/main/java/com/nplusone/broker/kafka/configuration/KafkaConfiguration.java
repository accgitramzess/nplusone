package com.nplusone.broker.kafka.configuration;

import org.springframework.context.annotation.Import;
import org.springframework.kafka.annotation.EnableKafka;

@EnableKafka
@Import({KafkaProducerConfiguration.class, KafkaConsumerConfig.class})
public class KafkaConfiguration { }
