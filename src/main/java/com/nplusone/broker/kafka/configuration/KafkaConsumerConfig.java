package com.nplusone.broker.kafka.configuration;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
import org.springframework.kafka.core.ConsumerFactory;
import org.springframework.kafka.core.DefaultKafkaConsumerFactory;
import org.springframework.kafka.support.serializer.JsonDeserializer;

import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.common.serialization.LongSerializer;

import com.nplusone.broker.kafka.dto.Event;

@Configuration
public class KafkaConsumerConfig {

    //@Value("${kafka.server}")
    private String kafkaServer;

    @Bean
    private Map<String, Object> kafkaConsumerEventConfigs() {
        Map<String, Object> props = new HashMap<>();
        props.put(ConsumerConfig.GROUP_ID_CONFIG, "event_group");
        props.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, kafkaServer = "localhost:9092");
        props.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, LongSerializer.class);
        props.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, new JsonDeserializer<>(Event.class));

        return props;
    }

    @Bean
    private ConsumerFactory<Long, Event> kafkaConsumerEventFactory() {
        return new DefaultKafkaConsumerFactory<>(kafkaConsumerEventConfigs());
    }

    @Bean
    public ConcurrentKafkaListenerContainerFactory<Long, Event> eventKafkaListenerContainerFactory() {
        ConcurrentKafkaListenerContainerFactory<Long, Event> factory = new ConcurrentKafkaListenerContainerFactory<>();
        factory.setConsumerFactory(kafkaConsumerEventFactory());

        return factory;
    }
}
