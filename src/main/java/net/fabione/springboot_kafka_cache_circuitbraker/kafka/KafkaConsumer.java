package net.fabione.springboot_kafka_cache_circuitbraker.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    private static final Logger LOGGER = LoggerFactory.getLogger(KafkaConsumer.class);

    @KafkaListener(topics = "demo-fub", groupId = "myGroup")
    public void consumer(String message){
        LOGGER.info(String.format("Message received -> %s", message));

    }

}
