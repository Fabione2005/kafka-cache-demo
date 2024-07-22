package net.fabione.springboot_kafka_cache_circuitbraker.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {

    @Bean
    public NewTopic demoTopic(){

        return TopicBuilder.name("demo-fub")
                .build();
    }


}
