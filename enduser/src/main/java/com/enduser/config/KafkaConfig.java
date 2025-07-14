package com.enduser.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

@Configuration
public class KafkaConfig {

    // The Magic lies here
    @KafkaListener(topics = AppConstants.LOCATION_UPDATE_TOPIC,groupId = AppConstants.GROUP_ID)
    public void updatedLocation(String value) {

        System.out.println(value);

    }

}
// Its the Consumer.
// There are multiple methods like LoggerFactory etc.
